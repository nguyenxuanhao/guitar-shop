package org.group02.guitarshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @RequestMapping(value = "/chi-tiet", method = RequestMethod.GET)
    public String Product() {
        return "/product/product-detail";
    }
}
