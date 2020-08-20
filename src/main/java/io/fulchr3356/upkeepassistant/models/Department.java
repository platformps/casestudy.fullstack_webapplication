package io.fulchr3356.upkeepassistant.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Department {
    private HashMap<String,Employee> Employees;
    private Employee departmentManager;
    private String departmentName;
    private Budget departmentBudget;
    private ArrayList<Sale> sales;

    public HashMap<String, Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(HashMap<String, Employee> employees) {
        Employees = employees;
    }

    public Employee getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Employee departmentManager) {
        this.departmentManager = departmentManager;
    }

    public String getName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Budget getDepartmentBudget() {
        return departmentBudget;
    }

    public void setDepartmentBudget(Budget departmentBudget) {
        this.departmentBudget = departmentBudget;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }





}
