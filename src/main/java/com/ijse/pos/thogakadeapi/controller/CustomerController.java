package com.ijse.pos.thogakadeapi.controller;

import com.ijse.pos.thogakadeapi.entity.Customer;
import com.ijse.pos.thogakadeapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("{id}")// customer/1
    public boolean deleteCustomer(@PathVariable Integer id) {
        return customerService.deleteCustomer(id);
    }

    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable Integer id) {
        return customerService.getCustomer(id);
    }

    @GetMapping("/all")
    public List<Customer> getAll() {
        return customerService.getAll();
    }
}
