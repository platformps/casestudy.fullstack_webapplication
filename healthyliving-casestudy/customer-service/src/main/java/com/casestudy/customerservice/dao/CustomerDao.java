package com.casestudy.customerservice.dao;

import com.casestudy.customerservice.model.Customer;

import java.util.List;


public interface CustomerDao {

    Customer addCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerById(int id);

    void updateCustomer(Customer customer);

    void deleteCustomer(int id);
}
