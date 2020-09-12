package com.devos.perscholas.casestudy.services;

import com.devos.perscholas.casestudy.dto.RegisterRequest;
import com.devos.perscholas.casestudy.models.User;

public class AuthService {
    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setEmail(registerRequest.getEmail());
        user.setFirstName(registerRequest.getFirstName());
        user.setLastName(registerRequest.getLastName());
        user.setPassword(registerRequest.getPassword());
        user.setEnabled(false);
    }
}
