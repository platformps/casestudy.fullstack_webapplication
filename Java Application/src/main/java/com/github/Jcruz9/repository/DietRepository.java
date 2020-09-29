package com.github.Jcruz9.repository;

import com.github.Jcruz9.model.Food;
import org.springframework.data.repository.CrudRepository;

public interface DietRepository extends CrudRepository<Food,Long> {

}
