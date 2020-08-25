package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Employee;
import io.fulchr3356.upkeepassistant.repositories.EmployeeRepository;
import java.util.Optional;


public class EmployeeController implements ControllerInterface<Employee> {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }
    @Override
    public void add(Employee employee) {
        this.employeeRepository.save(employee);
    }
    @Override
    public Optional<Employee> findById(Integer id){
        return employeeRepository.findById(id);
    }
    @Override
    public void update( Employee employee){
        employeeRepository.save(employee);
    }
    @Override
    public void delete(Integer id){
        employeeRepository.deleteById(id);
    }



}
