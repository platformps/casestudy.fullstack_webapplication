package com.github.perscholas.controllers;


import com.github.perscholas.validator.UserValidator;
import com.github.perscholas.models.UserAccount;
import com.github.perscholas.services.SecurityServiceImpl;
import com.github.perscholas.services.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserAccountController {
    private UserAccountService userService;
    private SecurityServiceImpl securityService;
    private UserValidator userValidator;

    @Autowired
    public UserAccountController(UserAccountService userService, UserValidator userValidator, SecurityServiceImpl securityService) {
        this.userService = userService;
        this.userValidator = userValidator;
        this.securityService = securityService;
    }

    @GetMapping(value = "/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new UserAccount());
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String registration(@ModelAttribute("userForm") UserAccount userAccountForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userAccountForm, bindingResult);
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.save(userAccountForm);
        securityService.autologin(userAccountForm.getUsername(), userAccountForm.getPasswordConfirm());
        return "redirect:/welcome";
    }

    @GetMapping(value = "/login")
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Your username and password are invalid.");
        }
        if (logout != null) {
            model.addAttribute("message", "You have logged out successfully.");
        }

        return "login";
    }

    @GetMapping(value = {"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }
}