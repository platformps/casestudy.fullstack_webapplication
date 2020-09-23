package com.github.perscholas.models;

import javax.persistence.*;


@Entity
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String strId;

    private String name;
    private String description;
    private double price;
    private int quantity;
    private double totalCost;

    @ManyToOne
    private ServiceCategory serviceCategory;

    public CartItem(String strId, String name, String description, double price, int quantity, double totalCost, ServiceCategory serviceCategory) {
        this.strId = strId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.totalCost = totalCost;
        this.serviceCategory = serviceCategory;
    }

    public CartItem() {

    }


    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}


