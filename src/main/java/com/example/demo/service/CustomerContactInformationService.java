package com.example.demo.service;

import com.example.demo.entity.CustomerContactInformation;
import com.example.demo.repository.CustomerContactInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerContactInformationService {

    @Autowired
    private CustomerContactInformationRepository customerContactInformationRepository;

    // Fetch all contact information
    public List<CustomerContactInformation> getAllContacts() {
        return customerContactInformationRepository.findAll();
    }

    // Save new contact information
    public CustomerContactInformation saveContact(CustomerContactInformation contactInfo) {
        return customerContactInformationRepository.save(contactInfo);
    }
}