package org.group02.guitarshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    @RequestMapping(value = "/lien-he", method = RequestMethod.GET)
    public String Contact() {
        return "/contact/contact";
    }
//    @RequestMapping(value = "/lien-he", method = RequestMethod.POST)
//    public String Contact() {
//        return "/contact/contact";
//    }
}
