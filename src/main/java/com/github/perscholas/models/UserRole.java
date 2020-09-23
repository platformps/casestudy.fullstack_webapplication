package com.github.perscholas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @JsonIgnore
    @ManyToMany
    @ElementCollection
    private List<UserAccount> userAccounts;

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

    public List<UserAccount> getUsers() {
        return userAccounts;
    }

    public void setUsers(List<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
    }
}
