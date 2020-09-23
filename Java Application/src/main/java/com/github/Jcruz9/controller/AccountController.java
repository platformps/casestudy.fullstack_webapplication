package com.github.Jcruz9.controller;

import com.github.Jcruz9.service.AccountService;
import com.github.Jcruz9.service.SecurityServiceImpl;
import com.github.Jcruz9.validator.AccountValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
private AccountService accountService;
private SecurityServiceImpl securityService;
private AccountValidator accountValidator;
}
