package com.devos.perscholas.casestudy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserLoginController {
    @GetMapping
    public String getView(Model model) {
        return "login";
    }

    //TODO - validate user has an account
    //TODO - forward user
}
