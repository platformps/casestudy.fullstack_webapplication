package io.fulchr3356.upkeepassistant.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
@Data
@Entity
public class Budget  implements EntityInterface<Integer>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Double amount;
    private Date renewDate;

    @ManyToOne(cascade=CascadeType.PERSIST)
    private User user;

    @ManyToOne (cascade = CascadeType.ALL)
    private Employee manager;

    public Budget(String name) {
        this.name = name;
        this.amount = 0.00;
    }

    public Budget() {
        this.amount = 0.00;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getRenewDate() {
        return renewDate;
    }

    public User getUser() {
        return user;
    }

    public Employee getManager() {
        return manager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setRenewDate(Date renewDate) {
        this.renewDate = renewDate;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
