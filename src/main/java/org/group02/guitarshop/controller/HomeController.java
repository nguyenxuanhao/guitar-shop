package org.group02.guitarshop.controller;

import org.group02.guitarshop.entity.Person;
import org.group02.guitarshop.models.PersonalInformation;
import org.group02.guitarshop.repository.PersonRepository;
import org.group02.guitarshop.service.CategoryService;
import org.group02.guitarshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model, HttpServletRequest request) {
        model.addAttribute("mostDiscountProducts", productService.getMostDiscountProducts());
        model.addAttribute("newestProducts", productService.getNewestProducts());
        model.addAttribute("categoryList",categoryService.getAllCategories());

        PersonalInformation personalInformation = new PersonalInformation();
        if (!SecurityContextHolder.getContext().getAuthentication().getPrincipal().equals("anonymousUser")) {
            Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
            String email = loggedInUser.getName();
            Person person = personRepository.findByEmail(email);
            personalInformation =
                    new PersonalInformation(person.getPerson_Id(), person.getName(), person.getPhone(), person.getEmail(), person.getAddress());
        }
        request.getSession().setAttribute("PersonalInformation", personalInformation);

        return "/home/index";
    }
}
