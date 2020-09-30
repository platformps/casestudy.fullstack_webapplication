package com.github.Jcruz9.controller;

import com.github.Jcruz9.model.Account;
import com.github.Jcruz9.service.AccountService;
import com.github.Jcruz9.service.SecurityServiceImpl;
import com.github.Jcruz9.validator.AccountValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
private AccountService accountService;
private SecurityServiceImpl securityService;
private AccountValidator accountValidator;

@Autowired
    public AccountController(AccountService accountService,AccountValidator accountValidator,SecurityServiceImpl securityService)
{
    this.accountService=accountService;
    this.accountValidator=accountValidator;
    this.securityService=securityService;
}

@GetMapping(value = "/signup_form")
    public String registration(Model model) {
model.addAttribute("userForm",new Account());
return "signup_form";
}

@PostMapping(value = "/signup_form")
    public String registration(@ModelAttribute("userForm") Account accounts, BindingResult bindingResult,Model model)
{
    accountValidator.validate(accounts,bindingResult);
    if(bindingResult.hasErrors())
    {
        return "signup_form";
    }
    accountService.save(accounts);
    securityService.autologin(accounts.getEmail(),accounts.getPasswordConfirm());
    return "redirect:/homepage";
}
@GetMapping(value = "/login_form")
    public String login(Model model, String error, String logout)
{
    if (error !=null)
    {
        model.addAttribute("error","Your email and password are invalid.");

    }
    if (logout !=null)
    {
        model.addAttribute("message","You have logged out successfully.");
    }
    return "login_form";
}
//@GetMapping(value = {"/","/homepage"})
//        public String welcome(Model model)
//{
//    return "homepage";
//}
//
//    public static class foodController {
//    }
}
