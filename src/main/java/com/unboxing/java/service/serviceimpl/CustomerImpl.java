package com.unboxing.java.service.serviceimpl;

import com.unboxing.java.entity.Customer;
import com.unboxing.java.repository.CustomerRepo;
import com.unboxing.java.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepo.deleteById(id);

    }
}
