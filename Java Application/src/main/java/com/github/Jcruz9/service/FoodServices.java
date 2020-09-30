package com.github.Jcruz9.service;

import com.github.Jcruz9.model.Food;
import com.github.Jcruz9.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodServices {
    private FoodRepository foodRepository;

    @Autowired
    public FoodServices(FoodRepository foodRepository)
    {
        this.foodRepository=foodRepository;
    }

    public Food createFoodInformation(Food foodToBeCreated)
    {
        Food persistedFood = foodRepository.save(foodToBeCreated);
        return persistedFood;
    }
    public Food readById(Long id)
    {
        return foodRepository.findById(id).get();
    }


    public Food addFood(String foodName,Integer calories,Integer carbs,Integer fat,Integer protein,Integer sodium,Integer sugar)
    {
        Food foodInDb=new Food();
        foodInDb.setFoodName(foodName);
        foodInDb.setCalories(calories);
        foodInDb.setCarbs(carbs);
        foodInDb.setFat(fat);
        foodInDb.setProtein(protein);
        foodInDb.setSodium(sodium);
        foodInDb.setSugar(sugar);
        foodInDb=foodRepository.save(foodInDb);
        return foodInDb;
    }


    public Food updateById (Long id, Food updateData)
    {
        Food foodInDb= readById(id);
        foodInDb.setDietJournal(updateData.getDietJournal());
        foodInDb.setFoodName(updateData.getFoodName());
        foodInDb.setCalories(updateData.getCalories());
        foodInDb.setFat(updateData.getFat());
        foodInDb.setCarbs(updateData.getCarbs());
        foodInDb.setSugar(updateData.getSugar());
        foodInDb.setProtein(updateData.getProtein());
        foodInDb.setSodium(updateData.getSodium());
        foodInDb=foodRepository.save(foodInDb);
        return foodInDb;
    }

    public List<Food> readAll()
    {
        Iterable<Food> foodIterable=foodRepository.findAll();
        List<Food> foodList= new ArrayList<>();
        foodIterable.forEach(foodList::add);
        return foodList;
    }
    public Integer addCalories()
    {
        Integer calories=0;
        List<Integer>totalCalories;
        List<Food> calorieList=readAll();
        for (int i=0;i<calorieList.size();i++)
        {
             calories += calorieList.get(i).getCalories();
        }
        return calories;

    }
    public Integer addCarbs()
    {
        Integer carbs=0;
        List<Integer>totalCalories;
        List<Food> carbList=readAll();
        for (int i=0;i<carbList.size();i++)
        {
            carbs += carbList.get(i).getCarbs();
        }
        return carbs;

    }
    public Integer addFat()
    {
        Integer fat=0;
        List<Integer>totalCalories;
        List<Food> fatList=readAll();
        for (int i=0;i<fatList.size();i++)
        {
            fat += fatList.get(i).getFat();
        }
        return fat;

    }
    public Integer addProtein()
    {
        Integer protein=0;
        List<Integer>totalCalories;
        List<Food> proteinList=readAll();
        for (int i=0;i<proteinList.size();i++)
        {
            protein += proteinList.get(i).getProtein();
        }
        return protein;

    }
    public Integer addSodium()
    {
        Integer sodium=0;
        List<Integer>totalCalories;
        List<Food> sodiumList=readAll();
        for (int i=0;i<sodiumList.size();i++)
        {
            sodium += sodiumList.get(i).getSodium();
        }
        return sodium;

    }
    public Integer addSugar()
    {
        Integer sugar=0;
        List<Integer>totalCalories;
        List<Food> sugarList=readAll();
        for (Food food : sugarList) {
            sugar += food.getSugar();
        }
        return sugar;

    }

    }
