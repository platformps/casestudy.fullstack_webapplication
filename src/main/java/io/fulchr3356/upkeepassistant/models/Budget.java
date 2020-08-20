package io.fulchr3356.upkeepassistant.models;

import java.util.Date;

public class Budget {
    private Integer totalBudgetAmount;
    private Integer actualBudgetAmount;
    private String departmentName;
    private Date renewDate;
    private Employee budgetManager;

    public Integer getTotalBudgetAmount() {
        return totalBudgetAmount;
    }

    public void setTotalBudgetAmount(Integer totalBudgetAmount) {
        this.totalBudgetAmount = totalBudgetAmount;
    }

    public Integer getActualBudgetAmount() {
        return actualBudgetAmount;
    }

    public void setActualBudgetAmount(Integer actualBudgetAmount) {
        this.actualBudgetAmount = actualBudgetAmount;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getRenewDate() {
        return renewDate;
    }

    public void setRenewDate(Date renewDate) {
        this.renewDate = renewDate;
    }

    public Employee getBudgetManager() {
        return budgetManager;
    }

    public void setBudgetManager(Employee budgetManager) {
        this.budgetManager = budgetManager;
    }
}
