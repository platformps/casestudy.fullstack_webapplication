package io.fulchr3356.upkeepassistant.models;

import java.util.ArrayList;
import java.util.HashMap;

public final class DepartmentBuilder {
    private HashMap<String, Employee> Employees;
    Integer id;
    private String departmentManager;
    private String departmentName;
    private Double budget;
    private ArrayList<Sale> sales;

    private DepartmentBuilder(Department dataToBeUpdated) {
        this.id = dataToBeUpdated.getId();
        this.departmentManager = dataToBeUpdated.getManager();
        this.departmentName = dataToBeUpdated.getName();
        this.budget = dataToBeUpdated.getBudget();
    }

    public DepartmentBuilder() {

    }

    public static DepartmentBuilder aDepartment() {
        return new DepartmentBuilder();
    }

    public DepartmentBuilder withEmployees(HashMap<String, Employee> Employees) {
        this.Employees = Employees;
        return this;
    }

    public DepartmentBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public DepartmentBuilder withDepartmentManager(String departmentManager) {
        this.departmentManager = departmentManager;
        return this;
    }

    public DepartmentBuilder withDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public DepartmentBuilder withDepartmentBudget(Double departmentBudget) {
        this.budget = departmentBudget;
        return this;
    }

    public DepartmentBuilder withSales(ArrayList<Sale> sales) {
        this.sales = sales;
        return this;
    }

    public Department build() {
        Department department = new Department();
        department.setId(id);
        department.setManager(departmentManager);
        department.setName(departmentName);
        department.setBudget(budget);
        return department;
    }
}
