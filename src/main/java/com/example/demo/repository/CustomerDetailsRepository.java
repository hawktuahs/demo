package com.example.demo.repository;

import com.example.demo.entity.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long> {
}