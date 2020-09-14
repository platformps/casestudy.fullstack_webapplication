package io.fulchr3356.upkeepassistant.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import lombok.*;

@Data
@Entity
public class Employee implements EntityInterface<Integer>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String position;
    private Double salary;

    public Employee(){
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Sale> sales;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Payroll> payrolls;

    @ManyToOne(cascade=CascadeType.ALL)
    private Department department;

    @Override
    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public Double getSalary() {
        return salary;
    }


    public User getUser() {
        return user;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public Department getDepartment() {
        return department;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}


