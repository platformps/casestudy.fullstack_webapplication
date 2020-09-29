package com.github.Jcruz9.model;

import javax.persistence.*;

@Entity
public class Food {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String foodName;
    private Integer calories;
    private Integer carbs;
    private Integer Fat;
    private Integer protein;
    private Integer sodium;
    private Integer sugar;




    @ManyToOne(cascade = CascadeType.ALL)
    private DietJournal dietJournal;


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getCarbs() {
        return carbs;
    }

    public void setCarbs(Integer carbs) {
        this.carbs = carbs;
    }

    public Integer getFat() {
        return Fat;
    }

    public void setFat(Integer fat) {
        Fat = fat;
    }

    public Integer getProtein() {
        return protein;
    }

    public void setProtein(Integer protein) {
        this.protein = protein;
    }

    public Integer getSodium() {
        return sodium;
    }

    public void setSodium(Integer sodium) {
        this.sodium = sodium;
    }

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DietJournal getDietJournal() {
        return dietJournal;
    }

    public void setDietJournal(DietJournal dietJournal) {
        this.dietJournal = dietJournal;
    }

}
