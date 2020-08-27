package io.fulchr3356.upkeepassistant.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
@Entity
@Table(name = "sale", schema = "upkeep_assistant")
public class Sale implements  EntityInterface<Integer>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String employeeFirstName;
    private String employeeLastName;
    private String productName;
    private Double amount;
    private Timestamp saleDate;

    public Sale(){
        this.amount = 0.00;
    }
    public Sale(String name ) {
        this.productName = name;
        this.amount = 0.00;


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "employee_first_name", nullable = false, length = 50)
    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    @Basic
    @Column(name = "employee_last_name", nullable = false, length = 50)
    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    @Basic
    @Column(name = "product_name", nullable = false, length = 50)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
    @Column(name = "sale_date", nullable = false)
    public Timestamp getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Timestamp saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale that = (Sale) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(employeeFirstName, that.employeeFirstName) &&
                Objects.equals(employeeLastName, that.employeeLastName) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(saleDate, that.saleDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeFirstName, employeeLastName, productName, amount, saleDate);
    }
}
