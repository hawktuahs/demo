package com.example.demo.controller;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerDetailsController {

    @Autowired
    private CustomerDetailsService customerDetailsService;

    // Get all customers
    @GetMapping
    public List<CustomerDetails> getAllCustomers() {
        return customerDetailsService.getAllCustomers();
    }

    // Create a new customer
    @PostMapping
    public CustomerDetails createCustomer(@RequestBody CustomerDetails customerDetails) {
        return customerDetailsService.saveCustomer(customerDetails);
    }
}