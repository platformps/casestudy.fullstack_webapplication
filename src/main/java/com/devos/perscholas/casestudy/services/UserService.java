package com.devos.perscholas.casestudy.services;

import com.devos.perscholas.casestudy.models.User;
import com.devos.perscholas.casestudy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Iterable<User> readAll() {
        return repository.findAll();
    }

    public User readById(Long id) {
        return repository.findById(id).get();
    }

    public User create(User user) {
        return repository.save(user);
    }

    public User update(Long id, User newUserData) {
        User originalUserData = repository.findById(id).get();
        originalUserData.setFirstName(newUserData.getFirstName());
        originalUserData.setLastName(newUserData.getLastName());
        originalUserData.setEmail(newUserData.getEmail());
        return repository.save(originalUserData);
    }

    public Boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}
