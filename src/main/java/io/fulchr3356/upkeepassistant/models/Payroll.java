package io.fulchr3356.upkeepassistant.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
import java.io.Serializable;

@Entity
@Table(name = "payroll", schema = "upkeep_assistant")
public class Payroll implements EntityInterface<Integer>, Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer employeeId;
    private Double amount;
    private Date payDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "employee_id", nullable = false)
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = id;
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
    @Column(name = "pay_date", nullable = false)
    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payroll payroll = (Payroll) o;
        return Objects.equals(employeeId, payroll.employeeId) &&
                Objects.equals(amount, payroll.amount) &&
                Objects.equals(payDate, payroll.payDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, amount, payDate);
    }


    @Override
    public String toString() {
        return "Payroll{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", amount=" + amount +
                ", payDate=" + payDate +
                ", user=" + user +
                '}';
    }
}