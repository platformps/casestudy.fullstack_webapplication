package com.github.perscholas.services;

import com.github.perscholas.models.User;
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

    public Iterable<User> index() {
        return userRegistrationRepo.findAll();
    }

    public User show(Long id) {
        return userRegistrationRepo.findById(id).get();
    }

    public User create(User user) {
        return userRegistrationRepo.save(user);
    }

    public User update(Long id, User newUserData) {
        User entryUser = userRegistrationRepo.findById(id).get();
        entryUser.setName(newUserData.getName());
        return userRegistrationRepo.save(entryUser);
    }

    public Boolean delete(Long id) {
        userRegistrationRepo.deleteById(id);
        return true;
    }
}