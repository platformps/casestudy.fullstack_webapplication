package io.fulchr3356.upkeepassistant.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Item implements EntityInterface<Integer>, Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer Quantity;
    private Double price;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Department> departments;


    @OneToOne
    private Sale sale;

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    User user;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
