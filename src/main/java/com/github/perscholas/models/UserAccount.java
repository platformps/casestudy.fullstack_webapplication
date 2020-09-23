package com.github.perscholas.models;


import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String address;
    private String phNumber;
    private String username;
    private String password;

    @Transient // don't persist; not a column
    private String passwordConfirm;

    @ManyToMany
    @ElementCollection
    private Set<UserRole> userRoles;

    @ManyToOne
    private ServiceCategory serviceCategory;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        UserAccount userAccount = (UserAccount) obj;
        return Objects.equals(id, userAccount.id) &&
                Objects.equals(name, userAccount.name) &&
                Objects.equals(email, userAccount.email) &&
                Objects.equals(address, userAccount.address) &&
                Objects.equals(phNumber, userAccount.phNumber) &&
                Objects.equals(username, userAccount.username) &&
                Objects.equals(password, userAccount.password) &&
                Objects.equals(passwordConfirm, userAccount.passwordConfirm);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
