package io.fulchr3356.upkeepassistant.models;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
@Entity
public class Department implements EntityInterface<Integer>, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Double  budget;
    private Date budgetRenewDate;

    @ManyToOne(cascade=CascadeType.PERSIST)
    private User user;

    @OneToOne
    private Employee manager;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Sale> sales;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Item> items;

    public Department(String name) {
        this.name = name;
    }

    public Department() {
        this.budget = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getBudget() {return budget; }

    public User getUser() {
        return user;
    }

    public Employee getManager() {
        return manager;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
