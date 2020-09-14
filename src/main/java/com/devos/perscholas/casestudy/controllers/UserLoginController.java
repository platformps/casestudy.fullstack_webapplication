package com.devos.perscholas.casestudy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user-login")
public class UserLoginController {
    @GetMapping
    public String getView(Model model) {
        model.addAttribute("log-btn", "Register");
        return "login";
    }
}
