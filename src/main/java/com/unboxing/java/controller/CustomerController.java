package com.unboxing.java.controller;

import com.unboxing.java.entity.Customer;
import com.unboxing.java.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }
    @DeleteMapping
    public void deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
    }

}
