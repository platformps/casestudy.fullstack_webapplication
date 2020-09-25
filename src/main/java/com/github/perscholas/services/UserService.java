package com.github.perscholas.services;

import com.github.perscholas.models.UserAccount;
import com.github.perscholas.repositories.UserRegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRegistrationRepo userRegistrationRepo;

    @Autowired
    public UserService(UserRegistrationRepo userRegistrationRepo) {

        this.userRegistrationRepo = userRegistrationRepo;
    }

    public Iterable<UserAccount> index() {
        return userRegistrationRepo.findAll();
    }

    public UserAccount show(Long id) {
        return userRegistrationRepo.findById(id).get();
    }

    public UserAccount create(UserAccount userAccount) {
        return userRegistrationRepo.save(userAccount);
    }

    public UserAccount update(Long id, UserAccount newUserAccountData) {
        UserAccount entryUserAccount = userRegistrationRepo.findById(id).get();
        entryUserAccount.setName(newUserAccountData.getName());
        return userRegistrationRepo.save(entryUserAccount);
    }

    public Boolean delete(Long id) {
        userRegistrationRepo.deleteById(id);
        return true;
    }
}