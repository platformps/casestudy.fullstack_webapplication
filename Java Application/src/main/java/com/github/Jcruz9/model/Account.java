package com.github.Jcruz9.model;

import sun.security.util.Password;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String email;
    private String Password;    // Look at spring security later for better verification.
    private Long accountId;

    @Transient
    private String passwordConfirm;

    @ManyToMany
    @ElementCollection
    private List<UserProfileRole> userRoles;




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public List<UserProfileRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserProfileRole> userRoles) {
        this.userRoles = userRoles;
    }
}
