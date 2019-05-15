package org.group02.guitarshop.controller;

import org.group02.guitarshop.model.ProductInfo;
import org.group02.guitarshop.dao.ProductDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class HomeController {

    @Autowired
    private ProductDAO productDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {

        return "index";
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String home(Model model) {
        List<ProductInfo> productInfoList = productDAO.listProductInfo();
        model.addAttribute("productList", productInfoList);
        return "product";
    }

}
