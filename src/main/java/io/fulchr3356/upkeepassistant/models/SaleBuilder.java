package io.fulchr3356.upkeepassistant.models;

import java.util.Date;

public final class SaleBuilder {
    private int id;
    private String productName;
    private String saleDepartment;
    private Date saleDate;
    private Employee employee;

    private SaleBuilder() {
    }

    public static SaleBuilder aSale() {
        return new SaleBuilder();
    }

    public SaleBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public SaleBuilder withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public SaleBuilder withSaleDepartment(String saleDepartment) {
        this.saleDepartment = saleDepartment;
        return this;
    }

    public SaleBuilder withSaleDate(Date saleDate) {
        this.saleDate = saleDate;
        return this;
    }

    public SaleBuilder withEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public Sale build() {
        Sale sale = new Sale();
        sale.setId(id);
        sale.setProductName(productName);
        sale.setSaleDepartment(saleDepartment);
        sale.setSaleDate(saleDate);
        sale.setEmployee(employee);
        return sale;
    }
}
