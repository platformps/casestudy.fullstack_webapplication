package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Employee;
import io.fulchr3356.upkeepassistant.repositories.EmployeeRepository;
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
@RequestMapping("/api")
public class EmployeeController  {
    private final EmployeeRepository employeeRepository;
    private final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping(value = "/employee")
    public Collection<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @PostMapping(value = "/employee")
    public ResponseEntity<Employee> add(@Valid @RequestBody Employee employee) throws URISyntaxException {
       Employee result = this.employeeRepository.save(employee);
       return ResponseEntity.created(new URI("/api/employee/" + employee.getId()))
               .body(result); }

    @GetMapping(value = "/employee/{id}")
     public ResponseEntity<?> findById(@PathVariable Integer id){
        Optional<Employee>  employee = employeeRepository.findById(id);
        return employee.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> update(@Valid @RequestBody Employee employee)  {
        log.info("Request to update employee: {}", employee);
        Employee result = employeeRepository.save(employee);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping(value = "/employee/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        log.info("Request to delete employee: {}", id);
        employeeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
