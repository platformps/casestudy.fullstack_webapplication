package io.fulchr3356.upkeepassistant.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "department", schema = "upkeep_assistant")
public class Department implements EntityInterface<Integer>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String manager;
    private String name;
    private Double budget;

    public Department(String name) {
        this.name = name;
    }

    public Department() {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "manager", length = 50)
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
    @Column(name = "budget", precision = 2)
    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(manager, that.manager) &&
                Objects.equals(name, that.name) &&
                Objects.equals(budget, that.budget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manager, name, budget);
    }
}
