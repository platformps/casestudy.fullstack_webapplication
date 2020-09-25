package com.github.curriculeon.service;

import com.github.curriculeon.model.UserAccount;
import com.github.curriculeon.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserAccountService {
    private UserAccountRepository repository;

    @Autowired
    public UserAccountService(UserAccountRepository repository) {
        this.repository = repository;
    }

}
