package com.github.perscholas.models;


import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String categoryName;

    @OneToMany
    @ElementCollection
    private Set<UserAccount> userAccounts;

    @OneToMany
    @ElementCollection
    private Set<CartItem> cartItems;

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

    public Set<UserAccount> getUser() {
        return userAccounts;
    }

    public void setUser(Set <UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
    public Set<CartItem> getCartItems() {
        return cartItems;
    }
}
