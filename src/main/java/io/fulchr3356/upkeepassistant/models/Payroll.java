package io.fulchr3356.upkeepassistant.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;
import java.io.Serializable;

@Data
@Entity
public class Payroll implements EntityInterface<Integer>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double amount;
    @OrderBy
    private Date payDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

    @OneToOne
    private Employee employee;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getPayDate() {
        return payDate;
    }

    public User getUser() {
        return user;
    }

    public Employee getEmployees() {
        return employee;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEmployees(Employee employee) {
        this.employee = employee;
    }
}