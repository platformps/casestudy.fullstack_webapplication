package com.casestudy.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String CartName;

    @OneToMany
    @ElementCollection
    private List<Product> Products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> Products) {
        this.Products = Products;
    }

    public String getCartName() {
        return CartName;
    }

    public void setCartName(String CartName) {
        this.CartName = CartName;
    }
}
