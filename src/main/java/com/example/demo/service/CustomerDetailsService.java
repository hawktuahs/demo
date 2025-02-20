package com.example.demo.service;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.repository.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDetailsService {

    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    // Fetch all customers
    public List<CustomerDetails> getAllCustomers() {
        return customerDetailsRepository.findAll();
    }

    // Save a new customer
    public CustomerDetails saveCustomer(CustomerDetails customerDetails) {
        return customerDetailsRepository.save(customerDetails);
    }
}