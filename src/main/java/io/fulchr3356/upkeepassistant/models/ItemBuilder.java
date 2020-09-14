package io.fulchr3356.upkeepassistant.models;

import java.util.List;

public final class ItemBuilder {
    List<Department> departments;
    List<Sale> sales;
    private Integer id;
    private Integer Quantity;
    private Double price;

    private ItemBuilder() {
    }

    public static ItemBuilder anItem() {
        return new ItemBuilder();
    }

    public ItemBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public ItemBuilder withQuantity(Integer Quantity) {
        this.Quantity = Quantity;
        return this;
    }

    public ItemBuilder withPrice(Double price) {
        this.price = price;
        return this;
    }

    public ItemBuilder withDepartments(List<Department> departments) {
        this.departments = departments;
        return this;
    }

    public ItemBuilder withSales(List<Sale> sales) {
        this.sales = sales;
        return this;
    }

    public Item build() {
        Item item = new Item();
        item.setId(id);
        item.setQuantity(Quantity);
        item.setPrice(price);
        item.setDepartments(departments);
        item.setSales(sales);
        return item;
    }
}
