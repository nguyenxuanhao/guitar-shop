package org.group02.guitarshop.controller;

import org.group02.guitarshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller

public class HomeController {

    @Resource(name = "productService")
    private ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {

        return "index";
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String displayAllProduct(Model model) {
        System.out.println("Product Page Requested : All Products");
        model.addAttribute("productList", productService.getAllProducts());
        return "product";
    }

}
