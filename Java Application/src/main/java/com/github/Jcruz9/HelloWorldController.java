package com.github.Jcruz9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
    @GetMapping
    String getView(Model model) {
        model.addAttribute("message", "Some Message");
        return "main_page";
    }
}