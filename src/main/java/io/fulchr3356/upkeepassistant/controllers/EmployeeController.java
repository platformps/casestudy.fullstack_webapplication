package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Employee;
import io.fulchr3356.upkeepassistant.repositories.EmployeeRepository;



public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();


    }

    public void add(Employee employee) {
        this.employeeRepository.save(employee);
    }
}
