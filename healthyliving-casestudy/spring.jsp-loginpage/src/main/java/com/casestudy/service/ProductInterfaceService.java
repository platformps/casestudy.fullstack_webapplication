package com.casestudy.service;

import com.casestudy.model.Cart;
import com.casestudy.model.Product;

import java.awt.*;
import java.util.List;
import java.util.Optional;

public interface ProductInterfaceService {
    //read
    Optional<Product> getProductById(String id);
     List<Product> getAll();

//update
    void updateProduct(Product product);
//create
    void createProduct(String name, double price, Integer Quantity,  Cart cart, boolean isCreated);
//delete
    void deleteProduct(String id);


}
