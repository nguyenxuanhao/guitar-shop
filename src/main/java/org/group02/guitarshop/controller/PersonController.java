package org.group02.guitarshop.controller;

import org.group02.guitarshop.entity.Person;
import org.group02.guitarshop.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;

@Controller
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    @RequestMapping(value="/dang-ky", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        Person person = new Person();
        modelAndView.addObject("person", person);
        modelAndView.setViewName("/user/register");
        return modelAndView;
    }

    @RequestMapping(value = "/dang-ky", method = RequestMethod.POST)
    public ModelAndView createNewPerson(@Valid Person person, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        Person personExists = personService.findPersonByEmail(person.getEmail());
        if (personExists != null) {
            bindingResult
                    .rejectValue("email", "error.person",
                            "Địa chỉ email đã có người đăng ký! Vui lòng thử lại.");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("/user/register");
        } else {
            personService.savePerson(person);
            modelAndView.addObject("successMessage", "Đăng ký thành công!");
            modelAndView.addObject("person", new Person());
            modelAndView.setViewName("/user/login");
        }
        return modelAndView;
    }
}
