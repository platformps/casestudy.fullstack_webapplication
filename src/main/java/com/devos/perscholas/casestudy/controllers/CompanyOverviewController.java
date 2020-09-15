package com.devos.perscholas.casestudy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class CompanyOverviewController {
    @Controller
    @RequestMapping("/company-overview")
    public class UserLoginController {
        @GetMapping
        public String getView(Model model) {

            return "company-overview";
        }
    }
}
