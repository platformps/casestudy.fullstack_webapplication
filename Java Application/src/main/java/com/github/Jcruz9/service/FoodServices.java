package com.github.Jcruz9.service;

import com.github.Jcruz9.model.Food;
import com.github.Jcruz9.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

}
