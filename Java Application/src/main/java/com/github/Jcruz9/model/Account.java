package com.github.Jcruz9.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String Password;    // Look at spring security later for better verification.

    @Transient  // don't persist; not a column
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
        return id;
    }

    public void setAccountId(Long id) {
        this.id = id;
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
