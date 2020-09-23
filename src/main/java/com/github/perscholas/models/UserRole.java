package com.github.perscholas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "userAccounts")
    //@ElementCollection
    private Set<UserAccount> userAccounts;

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

    public Set<UserAccount> getUsers() {
        return userAccounts;
    }

    public void setUsers(Set<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
    }
}
