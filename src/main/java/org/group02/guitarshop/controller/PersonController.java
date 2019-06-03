package org.group02.guitarshop.controller;

import org.group02.guitarshop.entity.Person;
import org.group02.guitarshop.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    @RequestMapping(value="/dang-ki", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        Person person = new Person();
        modelAndView.addObject("person", person);
        modelAndView.setViewName("/user/register");
        return modelAndView;
    }

    @RequestMapping(value = "/dang-ki", method = RequestMethod.POST)
    public ModelAndView createNewPerson(@Valid Person person, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        Person personExists = personService.findPersonByEmail(person.getEmail());
        if (personExists != null) {
            bindingResult
                    .rejectValue("email", "error.person",
                            "There is already a user registered with the email provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            personService.savePerson(person);
            modelAndView.addObject("successMessage", "Person has been registered successfully");
            modelAndView.addObject("person", new Person());
            modelAndView.setViewName("/user/register");

        }
        return modelAndView;
    }
}
