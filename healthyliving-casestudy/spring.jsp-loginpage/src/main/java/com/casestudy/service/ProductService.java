package com.casestudy.service;

import com.casestudy.model.Product;
import com.casestudy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductService() {

    }


    public Product create(Product productToBeCreated) {
        Product persistedProduct = (Product) repository.save(productToBeCreated);
        return persistedProduct;
    }

    public List<Product> readAll() {
        Iterable<Product> productIterable = repository.findAll();
        List<Product> productList = new ArrayList<>();
        productIterable.forEach(productList::add);
        return productList;
    }

    public Product readById(String id) {
        return (Product) repository.findById(id).get();
    }

    public Product updateById(Long id, Product updatedData) {
        Product productInDb = readById("id");
        productInDb.setName(updatedData.getName());
        productInDb.setPrice(updatedData.getPrice());
        productInDb.setPhoto(updatedData.getPhoto());
        productInDb = (Product) repository.save(productInDb);
        return productInDb;
    }

    public Product deleteById(Long id) {
        Product productToBeDeleted = readById("id");
        repository.delete(productToBeDeleted);
        return productToBeDeleted;
    }

    public Product updateName(Long id, String productName) {
        Product productInDatabase = readById("id");
        productInDatabase.setName(productName);
        return updateById(id, productInDatabase);
    }
}
