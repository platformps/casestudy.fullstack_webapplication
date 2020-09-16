package com.devos.perscholas.casestudy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard/{id}")
public class DashboardController {
    @GetMapping
    public String getView(Model model, @PathVariable Long id) {
        return "user-dashboard";
    }
}