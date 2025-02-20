package com.example.demo.service;

import com.example.demo.entity.CustomerIdentification;
import com.example.demo.repository.CustomerIdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerIdentificationService {

    @Autowired
    private CustomerIdentificationRepository customerIdentificationRepository;

    // Fetch all identifications
    public List<CustomerIdentification> getAllIdentifications() {
        return customerIdentificationRepository.findAll();
    }

    // Save new identification
    public CustomerIdentification saveIdentification(CustomerIdentification identification) {
        return customerIdentificationRepository.save(identification);
    }
}