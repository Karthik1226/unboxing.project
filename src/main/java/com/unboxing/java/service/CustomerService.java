package com.unboxing.java.service;

import com.unboxing.java.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer createCustomer(Customer customer);
    void deleteCustomer(int id);
}
