package com.devos.perscholas.casestudy.controllers;

import com.devos.perscholas.casestudy.dto.RegisterRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user-register")
public class RegisterController {
    @GetMapping
    public String getView(Model model) {

        return "register";
    }
}
