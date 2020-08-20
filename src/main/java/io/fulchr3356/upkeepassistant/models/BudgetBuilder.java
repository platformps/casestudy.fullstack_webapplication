package io.fulchr3356.upkeepassistant.models;

import java.util.Date;

public final class BudgetBuilder {
    private Integer totalBudgetAmount;
    private Integer actualBudgetAmount;
    private String departmentName;
    private Date renewDate;
    private Employee budgetManager;

    private BudgetBuilder() {
    }

    public static BudgetBuilder aBudget() {
        return new BudgetBuilder();
    }

    public BudgetBuilder withTotalBudgetAmount(Integer totalBudgetAmount) {
        this.totalBudgetAmount = totalBudgetAmount;
        return this;
    }

    public BudgetBuilder withActualBudgetAmount(Integer actualBudgetAmount) {
        this.actualBudgetAmount = actualBudgetAmount;
        return this;
    }

    public BudgetBuilder withDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public BudgetBuilder withRenewDate(Date renewDate) {
        this.renewDate = renewDate;
        return this;
    }

    public BudgetBuilder withBudgetManager(Employee budgetManager) {
        this.budgetManager = budgetManager;
        return this;
    }

    public Budget build() {
        Budget budget = new Budget();
        budget.setTotalBudgetAmount(totalBudgetAmount);
        budget.setActualBudgetAmount(actualBudgetAmount);
        budget.setDepartmentName(departmentName);
        budget.setRenewDate(renewDate);
        budget.setBudgetManager(budgetManager);
        return budget;
    }
}
