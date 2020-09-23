package com.github.perscholas.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class ServiceCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String categoryName;

    @OneToMany
    private List<UserAccount> userAccountList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<UserAccount> getUserList() {
        return userAccountList;
    }

    public void setUserList(List<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
}
