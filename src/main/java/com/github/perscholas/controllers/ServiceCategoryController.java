package com.github.perscholas.controllers;

import com.github.perscholas.models.ServiceCategory;
import com.github.perscholas.services.ServiceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/service_category-controller")
public class ServiceCategoryController {
    private ServiceCategoryService serviceCategoryService;

    @Autowired
    public ServiceCategoryController(ServiceCategoryService serviceCategoryService) {
        this.serviceCategoryService = serviceCategoryService;
    }

    @GetMapping("/")
    public ResponseEntity<Iterable<ServiceCategory>> index() {
        return new ResponseEntity<>(serviceCategoryService.index(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceCategory> show(@PathVariable Integer id) {
        return new ResponseEntity<>(serviceCategoryService.show(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ServiceCategory> create(@RequestBody ServiceCategory serviceCategory) {
        return new ResponseEntity<>(serviceCategoryService.create(serviceCategory), HttpStatus.CREATED);
    }

    @PostMapping("/{id}")
    public ResponseEntity<ServiceCategory> update(@PathVariable Integer id, @RequestBody ServiceCategory serviceCategory) {
        return new ResponseEntity<>(serviceCategoryService.update(id, serviceCategory), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Integer id) {
        return new ResponseEntity<>(serviceCategoryService.delete(id), HttpStatus.OK);
    }
}