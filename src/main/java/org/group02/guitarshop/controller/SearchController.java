package org.group02.guitarshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchController {

    @RequestMapping(value = "/tim-kiem", method = RequestMethod.GET)
    public String Search() {
        return "/search/search";
    }
}
