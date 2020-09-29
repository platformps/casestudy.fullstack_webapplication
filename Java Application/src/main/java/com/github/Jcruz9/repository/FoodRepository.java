package com.github.Jcruz9.repository;

import com.github.Jcruz9.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {

}
