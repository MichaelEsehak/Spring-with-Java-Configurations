/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web;

import com.entity.User;
import com.service.UserService;
import com.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Michael
 */
@Controller
public class WelcomeController {

    private final WelcomeService welcomeService;
    @Autowired
    private UserService userService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public String test(@PathVariable("userName") String name, Model model) {
        model.addAttribute("name", welcomeService.getName(name));

        return "index";

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("name", "Michael");
        return "index";

    }

    @PreAuthorize("hasRole('Super Admin')") 
    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public String listUsers(Model model) {
//        User u=new User();
//        u.setName("done");
//        userService.save(u);
        // Company c = userService.findAll().iterator().next().getCompany();
        User u = userService.findAll().iterator().next();
        //  Hibernate.initialize(c.getUsers());

        model.addAttribute("name", u.getRoles().get(0).getName());
        return "index";

    }
    @RequestMapping (value ="/logout" , method = RequestMethod.GET)
    public String logout(){
        SecurityContextHolder.getContext().setAuthentication(null);
        return "/";
    }
    
    @RequestMapping (value ="/user/test" , method = RequestMethod.GET)
    public String test(Model model){
        model.addAttribute("name", "test");
        return "index";
    }
}
