package org.group02.guitarshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
    public String Login() {
        return "/user/login";
    }

    @RequestMapping(value = "/dang-ki", method = RequestMethod.GET)
    public String Register() {
        return "/user/register";
    }
}
