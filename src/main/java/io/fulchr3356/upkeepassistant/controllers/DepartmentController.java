package io.fulchr3356.upkeepassistant.controllers;

import io.fulchr3356.upkeepassistant.models.Department;
import io.fulchr3356.upkeepassistant.repositories.DepartmentRepository;

import java.util.Optional;

public class DepartmentController implements ControllerInterface<Department> {
    private final DepartmentRepository departmentRepository;

    public DepartmentController(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }
    @Override
    public Optional<Department> findById(Integer id) {
        return departmentRepository.findById(id);
    }

    @Override
    public Iterable<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public void update(Department department) {
        //TODO build Department
        departmentRepository.save(department);
    }

    @Override
    public void add(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void delete(Integer id) {
        departmentRepository.deleteById(id);
    }
}
