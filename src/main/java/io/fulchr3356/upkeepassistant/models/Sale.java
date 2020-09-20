package io.fulchr3356.upkeepassistant.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Sale implements  EntityInterface<Integer>, Serializable {

    public Double getAmount() {
        return amount;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public User getUser() {
        return user;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Department getDepartment() {
        return department;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double amount;
    private String saleDate;

    @ManyToOne(cascade=CascadeType.PERSIST)
    private User user;

    @OneToOne
    private Employee employee;

    @OneToOne
    private Department department;

    @OneToOne
    private Item item;

    @OneToMany
    private List<Item> items;

    public Sale(){
        this.amount = 0.00;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public Sale(String name ) {
        this.amount = 0.00;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
