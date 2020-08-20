package io.fulchr3356.upkeepassistant.models;

import java.util.ArrayList;
import java.util.HashMap;

public final class DepartmentBuilder {
    private HashMap<String, Employee> Employees;
    private Employee departmentManager;
    private String departmentName;
    private Budget departmentBudget;
    private ArrayList<Sale> sales;

    private DepartmentBuilder() {
    }

    public static DepartmentBuilder aDepartment() {
        return new DepartmentBuilder();
    }

    public DepartmentBuilder withEmployees(HashMap<String, Employee> Employees) {
        this.Employees = Employees;
        return this;
    }

    public DepartmentBuilder withDepartmentManager(Employee departmentManager) {
        this.departmentManager = departmentManager;
        return this;
    }

    public DepartmentBuilder withDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public DepartmentBuilder withDepartmentBudget(Budget departmentBudget) {
        this.departmentBudget = departmentBudget;
        return this;
    }

    public DepartmentBuilder withSales(ArrayList<Sale> sales) {
        this.sales = sales;
        return this;
    }

    public Department build() {
        Department department = new Department();
        department.setEmployees(Employees);
        department.setDepartmentManager(departmentManager);
        department.setDepartmentName(departmentName);
        department.setDepartmentBudget(departmentBudget);
        department.setSales(sales);
        return department;
    }
}
