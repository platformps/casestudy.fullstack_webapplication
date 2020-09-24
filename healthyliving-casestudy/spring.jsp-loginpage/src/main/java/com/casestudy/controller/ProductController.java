package com.casestudy.controller;

import com.casestudy.model.Product;
import com.casestudy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    private ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping(value = "/")
    public ResponseEntity<Product> create(Product employeeToBeCreated) {
        return new ResponseEntity<>(service.create(employeeToBeCreated), HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> readById(@PathVariable Long id) {
        return new ResponseEntity<>(service.readById("id"), HttpStatus.OK);
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Product>> readAll() {
        return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Product> updateById(
            @PathVariable Long id,
            @RequestBody Product newData) {
        return new ResponseEntity<>(service.updateById(id, newData), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Product> deleteById(@PathVariable Long id) {
        return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
    }

}
