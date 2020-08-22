package io.fulchr3356.upkeepassistant.models;

import java.sql.Timestamp;

public final class SaleBuilder {
    private Integer id;
    private String employeeFirstName;
    private String employeeLastName;
    private String productName;
    private Double amount;
    private Timestamp saleDate;

    private SaleBuilder() {
    }

    public static SaleBuilder aSale() {
        return new SaleBuilder();
    }

    public SaleBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public SaleBuilder withEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
        return this;
    }

    public SaleBuilder withEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
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

    public SaleBuilder withSaleDate(Timestamp saleDate) {
        this.saleDate = saleDate;
        return this;
    }

    public Sale build() {
        Sale sale = new Sale();
        sale.setId(id);
        sale.setEmployeeFirstName(employeeFirstName);
        sale.setEmployeeLastName(employeeLastName);
        sale.setProductName(productName);
        sale.setAmount(amount);
        sale.setSaleDate(saleDate);
        return sale;
    }
}
