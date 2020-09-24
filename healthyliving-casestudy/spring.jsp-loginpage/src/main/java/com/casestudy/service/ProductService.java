package com.casestudy.service;

import com.casestudy.model.Product;
import com.casestudy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository repository;


    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product create(Product ProductToBeCreated) {
        Product persistedProduct = repository.save(ProductToBeCreated);
        return persistedProduct;
    }

    public List<Product> readAll() {
        Iterable<Product> ProductIterable = repository.findAll();
        List<Product> ProductList = new ArrayList<>();
        ProductIterable.forEach(ProductList::add);
        return ProductList;
    }

    public Product readById(Long id) {
        return repository.findById(id).get();
    }

    public Product updateById(Long id, Product updatedData) {
        Product ProductInDb = readById(id);
        ProductInDb.setCart(updatedData.getCart());
        ProductInDb.setName(updatedData.getName());
        ProductInDb.setPrice(updatedData.getPrice());
        ProductInDb.setQuantity(updatedData.getQuantity());
        ProductInDb = repository.save(ProductInDb);
        return ProductInDb;
    }

    public Product deleteById(Long id) {
        Product ProductToBeDeleted = readById(id);
        repository.delete(ProductToBeDeleted);
        return ProductToBeDeleted;
    }

    public Product updateFirstName(Long id, String name) {
        Product ProductInDatabase = readById(id);
        ProductInDatabase.setName(name);
        return updateById(id, ProductInDatabase);
    }
}
