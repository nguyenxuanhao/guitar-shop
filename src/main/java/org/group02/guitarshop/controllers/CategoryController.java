package org.group02.guitarshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {

    @RequestMapping(value = "/danh-sach", method = RequestMethod.GET)
    public String Category() {
        return "/category/category";
    }
}
