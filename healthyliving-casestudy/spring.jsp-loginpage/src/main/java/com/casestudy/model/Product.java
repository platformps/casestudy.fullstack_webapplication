package com.casestudy.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Double price;
    private Integer quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cart Cart;

    public Product() {
    }

    public Product(String name, Double price, Integer quantity, Cart cart) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
        Cart = cart;
    }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public com.casestudy.model.Cart getCart() {
        return Cart;
    }

    public void setCart(com.casestudy.model.Cart cart) {
        Cart = cart;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
