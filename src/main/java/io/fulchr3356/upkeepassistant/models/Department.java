package io.fulchr3356.upkeepassistant.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
@Data
@Entity
public class Department implements EntityInterface<Integer>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Budget budget;

    @ManyToOne(cascade=CascadeType.PERSIST)
    private User user;

    @ManyToOne (cascade = CascadeType.ALL)
    private Employee manager;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Sale> sales;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
    }

    public Department() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Budget getBudget() {
        return budget;
    }

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

    public void setBudget(Budget budget) {
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
