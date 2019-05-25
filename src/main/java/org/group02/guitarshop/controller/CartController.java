package org.group02.guitarshop.controller;

import org.group02.guitarshop.entity.Product;
import org.group02.guitarshop.models.CartItemModel;
import org.group02.guitarshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CartController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/gio-hang")
    public String viewDetail() {
        return "/cart/cart-detail";
    }

    @RequestMapping(value = "/add-to-cart", method = RequestMethod.GET)
    public String addToCart(ModelMap mm, HttpSession session, @RequestParam("productId") int productId) {
        HashMap<Integer, CartItemModel> sessionCart = (HashMap<Integer, CartItemModel>) session.getAttribute("sessionCart");

        if (sessionCart == null) {
            sessionCart = new HashMap<>();
        }

        Product product = productService.getProductById(productId);

        if (product != null) {
            if (sessionCart.containsKey(productId)) {
                CartItemModel item = sessionCart.get(productId);
                item.setProduct(product);
                item.setQuantity(item.getQuantity() + 1);
                sessionCart.put(productId, item);
            } else {
                CartItemModel item = new CartItemModel();
                item.setProduct(product);
                item.setQuantity(1);
                sessionCart.put(productId, item);
            }
        }

        session.setAttribute("sessionCart", sessionCart);
        session.setAttribute("sessionCartNum", sessionCart.size());
        session.setAttribute("sessionCartTotal", getTotalPrice(sessionCart));

        return "redirect:/gio-hang";
    }

    @RequestMapping(value = "/remove-from-cart", method = RequestMethod.GET)
    public String removeFromCart(ModelMap mm, HttpSession session, @RequestParam("productId") int productId) {
        HashMap<Integer, CartItemModel> sessionCart = (HashMap<Integer, CartItemModel>) session.getAttribute("sessionCart");

        if (sessionCart == null) {
            sessionCart = new HashMap<>();
        }

        if (sessionCart.containsKey(productId)) {
            sessionCart.remove(productId);
        }

        if(sessionCart.size()==0){
            session.setAttribute("sessionCart", null);
            session.setAttribute("sessionCartNum", null);
            session.setAttribute("sessionCartTotal", null);
        }else{
            session.setAttribute("sessionCart", sessionCart);
            session.setAttribute("sessionCartNum", sessionCart.size());
            session.setAttribute("sessionCartTotal", getTotalPrice(sessionCart));
        }

        return "redirect:/gio-hang";
    }

    @RequestMapping(value = "/thanh-toan", method = RequestMethod.GET)
    public String Checkout() {

        return "/cart/checkout";
    }

    public double getTotalPrice(HashMap<Integer, CartItemModel> sessionCart) {
        double sum = 0;

        for (Map.Entry<Integer, CartItemModel> list : sessionCart.entrySet()) {
            Product pd = list.getValue().getProduct();
            Integer qty = list.getValue().getQuantity();

            double discountedPrice = pd.getPrice() * (100 - pd.getDiscountAmount()) / 100;
            sum += discountedPrice * qty;
        }
        return sum;
    }

}
