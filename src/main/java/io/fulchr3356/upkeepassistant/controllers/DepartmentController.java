package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Department;
import io.fulchr3356.upkeepassistant.repositories.DepartmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class DepartmentController  {
    private final DepartmentRepository departmentRepository;
    private final Logger log = LoggerFactory.getLogger(DepartmentController.class);

    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    @GetMapping(value = "/department")
    public Collection<Department> findAll() {
        return departmentRepository.findAll();
    }


    ResponseEntity<?> add(@Valid @RequestBody Department department) throws URISyntaxException {
        @Valid Department result = this.departmentRepository.save(department);
        return ResponseEntity.created(new URI("/api/department/" + department.getId()))
                .body(result); }

    @GetMapping(value = "/department/{id}")
    ResponseEntity<?> findById(@PathVariable Integer id){
        Optional<Department>  department = departmentRepository.findById(id);
        return department.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping(value = "/department/{id}")
    ResponseEntity<?> update(@Valid @RequestBody Department department)  {
        log.info("Request to update department: {}", department);
        Department result = departmentRepository.save(department);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping(value = "/department/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        log.info("Request to delete department: {}", id);
        departmentRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
