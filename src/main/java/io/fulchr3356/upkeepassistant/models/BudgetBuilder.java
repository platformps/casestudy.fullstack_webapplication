package io.fulchr3356.upkeepassistant.models;

import java.sql.Timestamp;
import java.util.Date;

public final class BudgetBuilder {
    private Integer id;
    private Employee manager;
    private String name;
    private Double amount;
    private Date renewDate;

    private BudgetBuilder() {
    }

    public static BudgetBuilder aBudget() {
        return new BudgetBuilder();
    }

    public BudgetBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public BudgetBuilder withManager(Employee manager) {
        this.manager = manager;
        return this;
    }

    public BudgetBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public BudgetBuilder withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public BudgetBuilder withRenewDate(Date renewDate) {
        this.renewDate = renewDate;
        return this;
    }

    public Budget build() {
        Budget budget = new Budget();
        budget.setId(id);
        budget.setManager(manager);
        budget.setName(name);
        budget.setAmount(amount);
        budget.setRenewDate(renewDate);
        return budget;
    }
}
