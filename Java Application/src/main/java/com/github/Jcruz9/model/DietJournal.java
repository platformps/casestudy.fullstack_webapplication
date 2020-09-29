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





}
