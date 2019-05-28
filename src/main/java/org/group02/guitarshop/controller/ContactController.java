package org.group02.guitarshop.controller;

import org.group02.guitarshop.entity.Message;
import org.group02.guitarshop.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @RequestMapping(value = "/lien-he", method = RequestMethod.GET)
    public String Contact() {
        return "/contact/contact";
    }

    @RequestMapping(value = "/lien-he", method = RequestMethod.POST)
    @ResponseBody
    public Boolean Contact(@RequestBody Message message) {
        contactService.insertMessage(message);
        return true;
    }
}
