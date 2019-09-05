package com.labiv.metazoa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * LoginController
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("pages/login");
    }
}