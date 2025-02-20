package com.example.demo.controller;

import com.example.demo.entity.CustomerContactInformation;
import com.example.demo.service.CustomerContactInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class CustomerContactInformationController {

    @Autowired
    private CustomerContactInformationService customerContactInformationService;

    // Get all contact information
    @GetMapping
    public List<CustomerContactInformation> getAllContacts() {
        return customerContactInformationService.getAllContacts();
    }

    // Create new contact information
    @PostMapping
    public CustomerContactInformation createContact(@RequestBody CustomerContactInformation contactInfo) {
        return customerContactInformationService.saveContact(contactInfo);
    }
}