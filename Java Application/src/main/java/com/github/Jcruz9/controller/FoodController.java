package com.github.Jcruz9.controller;

import com.github.Jcruz9.model.Food;
import com.github.Jcruz9.service.DietJournalServices;
import com.github.Jcruz9.service.FoodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping(value = "/foodForm",method = RequestMethod.GET)
    public String showFoodPage(ModelMap model)
    {
        return "foodForm";
    }
    @RequestMapping(value = "/foodForm", method = RequestMethod.POST)
    public String populateList(ModelMap model,@RequestParam String foodName,@RequestParam Integer calories,@RequestParam Integer carbs,@RequestParam Integer fat,@RequestParam Integer protein,@RequestParam Integer sodium,@RequestParam Integer sugar)
    {

        Food foodItem=foodServices.addFood(foodName,calories,carbs,fat,protein,sodium,sugar);
        model.put("foodName",foodName);
        model.put("calories",calories);
        model.put("carbs",carbs);
        model.put("fat",fat);
        model.put("protein",protein);
        model.put("sodium",sodium);
        model.put("sugar",sugar);
        return "/chart";

    }

    @RequestMapping(value = "/chart",method = RequestMethod.GET)
    public String showFood(ModelMap model)
    {
        model.put("calories",foodServices.addCalories());
        model.put("carbs",foodServices.addCarbs());
        model.put("fat",foodServices.addFat());
        model.put("protein",foodServices.addProtein());
        model.put("sodium",foodServices.addSodium());
        model.put("sugar",foodServices.addSugar());
        return "/chart";
    }

}
