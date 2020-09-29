package com.github.Jcruz9.controller;

import com.github.Jcruz9.model.Food;
import com.github.Jcruz9.service.DietJournalServices;
import com.github.Jcruz9.service.FoodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class FoodController {
    private FoodServices foodServices;
    private DietJournalServices dietJournalServices;

    @Autowired
    public FoodController(FoodServices foodServices, DietJournalServices dietJournalServices)
    {
        this.foodServices=foodServices;
        this.dietJournalServices=dietJournalServices;
    }
    public ResponseEntity<Food> create(Food foodNutrients)
    {
        return new ResponseEntity<>(foodServices.createFoodInformation(foodNutrients), HttpStatus.CREATED);
    }

    public ResponseEntity<Food> updateById(Long id,Food newData)
    {
        return new ResponseEntity<>(foodServices.updateById(id,newData),HttpStatus.OK);
    }


}
