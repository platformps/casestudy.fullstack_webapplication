package io.fulchr3356.upkeepassistant.models;

import java.sql.Timestamp;

public final class SaleBuilder {
    private Integer id;
    private Employee employee;
    private String productName;
    private Double amount;
    private String saleDate;

    private SaleBuilder() {
    }

    public static SaleBuilder aSale() {
        return new SaleBuilder();
    }

    public SaleBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public SaleBuilder withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public SaleBuilder withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public SaleBuilder withEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public SaleBuilder withSaleDate(String saleDate) {
        this.saleDate = saleDate;
        return this;
    }

    public Sale build() {
        Sale sale = new Sale();
        sale.setId(id);
        sale.setEmployee(employee);
        sale.setAmount(amount);
        sale.setSaleDate(saleDate);
        return sale;
    }
}
