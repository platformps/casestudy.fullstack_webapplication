package io.fulchr3356.upkeepassistant.models;

import java.sql.Timestamp;

public final class BudgetBuilder {
    private Integer id;
    private String manager;
    private String name;
    private Double amount;
    private Timestamp renewDate;

    private BudgetBuilder() {
    }

    public static BudgetBuilder aBudget() {
        return new BudgetBuilder();
    }

    public BudgetBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public BudgetBuilder withManager(String manager) {
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

    public BudgetBuilder withRenewDate(Timestamp renewDate) {
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
