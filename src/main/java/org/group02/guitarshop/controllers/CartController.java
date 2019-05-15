package org.group02.guitarshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CartController {

    @RequestMapping(value = "/gio-hang", method = RequestMethod.GET)
    public String CartDetail() {
        return "/cart/cart-detail";
    }

    @RequestMapping(value = "/thanh-toan", method = RequestMethod.GET)
    public String Checkout() {
        return "/cart/checkout";
    }

}
