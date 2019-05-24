package org.group02.guitarshop.controller;

import org.group02.guitarshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/tim-kiem", method = RequestMethod.GET)
    public String Search(@RequestParam (value = "tu-khoa") String searchString , Model model) {
        model.addAttribute("result",productService.searchProducts(searchString));
        model.addAttribute("count",productService.searchProducts(searchString).size());
        return "/search/search";
    }
}
