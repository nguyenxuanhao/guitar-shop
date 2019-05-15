package org.group02.guitarshop.controller;

import org.group02.guitarshop.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductDAO productDAO;
    @RequestMapping("/product")
    public java.util.List getProductList() {
        return productDAO.listProductInfo();
    }
}
