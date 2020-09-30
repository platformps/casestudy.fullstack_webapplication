package com.github.Jcruz9.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class DietJournal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String dietName;

    @OneToMany
    @ElementCollection
    private List<Food> foodList;

    @OneToMany
    @ElementCollection
    private List<Account> userRoles;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDietName() {
        return dietName;
    }

    public void setDietName(String dietName) {
        this.dietName = dietName;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }







}
