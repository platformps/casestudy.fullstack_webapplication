package io.fulchr3356.upkeepassistant.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "budget", schema = "upkeep_assistant")
public class Budget  implements EntityInterface<Integer>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String manager;
    private String name;
    private Double amount;
    private String renewDate;

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

    @Basic
    @Column(name = "manager", nullable = true, length = 50)
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "amount", nullable = false, precision = 2)
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "renew_date", nullable = false)
    public String getRenewDate() {
        return renewDate;
    }

    public void setRenewDate(String renewDate) {
        this.renewDate = renewDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Budget that = (Budget) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(manager, that.manager) &&
                Objects.equals(name, that.name) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(renewDate, that.renewDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manager, name, amount, renewDate);
    }
}
