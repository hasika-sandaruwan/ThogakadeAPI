package com.ijse.pos.thogakadeapi.repository;

import com.ijse.pos.thogakadeapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
