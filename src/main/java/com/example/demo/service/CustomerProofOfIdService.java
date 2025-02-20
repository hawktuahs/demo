package com.example.demo.service;

import com.example.demo.entity.CustomerProofOfId;
import com.example.demo.repository.CustomerProofOfIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerProofOfIdService {

    @Autowired
    private CustomerProofOfIdRepository customerProofOfIdRepository;

    // Fetch all proofs of ID
    public List<CustomerProofOfId> getAllProofs() {
        return customerProofOfIdRepository.findAll();
    }

    // Save new proof of ID
    public CustomerProofOfId saveProof(CustomerProofOfId proofOfId) {
        return customerProofOfIdRepository.save(proofOfId);
    }
}