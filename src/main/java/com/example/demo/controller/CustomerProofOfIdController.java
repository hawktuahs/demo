package com.example.demo.controller;

import com.example.demo.entity.CustomerProofOfId;
import com.example.demo.service.CustomerProofOfIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proofs")
public class CustomerProofOfIdController {

    @Autowired
    private CustomerProofOfIdService customerProofOfIdService;

    // Get all proofs of ID
    @GetMapping
    public List<CustomerProofOfId> getAllProofs() {
        return customerProofOfIdService.getAllProofs();
    }

    // Create new proof of ID
    @PostMapping
    public CustomerProofOfId createProof(@RequestBody CustomerProofOfId proofOfId) {
        return customerProofOfIdService.saveProof(proofOfId);
    }
}