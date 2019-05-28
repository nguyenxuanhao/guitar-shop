package org.group02.guitarshop.controller;

import org.group02.guitarshop.entity.DiscountCode;
import org.group02.guitarshop.entity.Product;
import org.group02.guitarshop.models.CartItemModel;
import org.group02.guitarshop.service.DiscountCodeService;
import org.group02.guitarshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.plugin2.main.client.DisconnectedExecutionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CartController {

    @Autowired
    private ProductService productService;

    @Autowired
    private DiscountCodeService discountCodeService;

    @RequestMapping(value = "/gio-hang")
    public String viewDetail(Model model) {
        DiscountCode discountCode=new DiscountCode();
        model.addAttribute("discountCode",discountCode);

        return "/cart/cart-detail";
    }

    @RequestMapping(value = "/add-to-cart", method = RequestMethod.GET)
    public String addToCart(HttpSession session, @RequestParam("productId") int productId, @RequestParam("quantity") int quantity) {
        HashMap<Integer, CartItemModel> sessionCart = (HashMap<Integer, CartItemModel>) session.getAttribute("sessionCart");

        if (sessionCart == null) {
            sessionCart = new HashMap<>();
        }

        Product product = productService.getProductById(productId);

        if (product != null) {
            if (sessionCart.containsKey(productId)) {
                CartItemModel item = sessionCart.get(productId);
                item.setProduct(product);
                item.setQuantity(item.getQuantity() + quantity);
                sessionCart.put(productId, item);
            } else {
                CartItemModel item = new CartItemModel();
                item.setProduct(product);
                item.setQuantity(quantity);
                sessionCart.put(productId, item);
            }
        }

        session.setAttribute("sessionCart", sessionCart);
        session.setAttribute("sessionCartNum", sessionCart.size());
        session.setAttribute("sessionCartTotal", getTotalPrice(sessionCart));

        return "redirect:/gio-hang";
    }

    @RequestMapping(value = "/remove-from-cart", method = RequestMethod.GET)
    public String removeFromCart(HttpSession session, @RequestParam("productId") int productId) {
        HashMap<Integer, CartItemModel> sessionCart = (HashMap<Integer, CartItemModel>) session.getAttribute("sessionCart");

        if (sessionCart == null) {
            sessionCart = new HashMap<>();
        }

        sessionCart.remove(productId);

        if (sessionCart.size() == 0) {
            session.setAttribute("sessionCart", null);
            session.setAttribute("sessionCartNum", null);
            session.setAttribute("sessionCartTotal", null);
        } else {
            session.setAttribute("sessionCart", sessionCart);
            session.setAttribute("sessionCartNum", sessionCart.size());
            session.setAttribute("sessionCartTotal", getTotalPrice(sessionCart));
        }

        return "redirect:/gio-hang";
    }

    @RequestMapping(value = "/update-cart", method = RequestMethod.GET)
    public @ResponseBody String updateCart(HttpSession session, HttpServletRequest request) {

        String productIdString = request.getParameter("productId");
        String quantityString = request.getParameter("quantity");

        Integer productId = Integer.parseInt(productIdString);
        Integer quantity = Integer.parseInt(quantityString);

        HashMap<Integer, CartItemModel> sessionCart = (HashMap<Integer, CartItemModel>) session.getAttribute("sessionCart");

        if (sessionCart.containsKey(productId)) {
            CartItemModel item = sessionCart.get(productId);
            item.setQuantity(quantity);
            sessionCart.put(productId, item);
        }

        session.setAttribute("sessionCart", sessionCart);
        session.setAttribute("sessionCartNum", sessionCart.size());
        session.setAttribute("sessionCartTotal", getTotalPrice(sessionCart));

        return "1";
    }

    @RequestMapping(value="/apply-discount-code", method=RequestMethod.POST)
    public String applyDiscountCode(HttpSession session, @ModelAttribute("discountCode") DiscountCode discountCode){
        removeDiscountCode(session);

        DiscountCode newDiscountCode=discountCodeService.getDiscountCodeByCode(discountCode.getCode());
        if (newDiscountCode != null) {
            session.setAttribute("sessionDiscountCode",newDiscountCode);
        }

        return "redirect:/gio-hang";
    }

    @RequestMapping(value="/remove-discount-code", method=RequestMethod.GET)
    public String removeDiscountCode(HttpSession session, @ModelAttribute("discountCode") DiscountCode discountCode){
        removeDiscountCode(session);
        return "redirect:/gio-hang";
    }

    @RequestMapping(value = "/thanh-toan", method = RequestMethod.GET)
    public String checkout() {

        return "/cart/checkout";
    }

    private double getTotalPrice(HashMap<Integer, CartItemModel> sessionCart) {
        double sum = 0;

        for (Map.Entry<Integer, CartItemModel> list : sessionCart.entrySet()) {

            Product pd = list.getValue().getProduct();
            Integer qty = list.getValue().getQuantity();

            double discountedPrice = pd.getPrice() * (100 - pd.getDiscountAmount()) / 100;
            sum += discountedPrice * qty;
        }
        return sum;
    }

    private void removeDiscountCode(HttpSession session){
        session.setAttribute("sessionDiscountCode", null);
    }

}
