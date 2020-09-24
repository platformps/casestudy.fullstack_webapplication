package com.casestudy.repository;

import com.casestudy.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}

