package com.ijse.pos.thogakadeapi.service;

import com.ijse.pos.thogakadeapi.entity.Customer;
import com.ijse.pos.thogakadeapi.repository.CustomerRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class CustomerService {
    private final CustomerRepository repo;

    public Customer createCustomer(Customer customer) {
        return repo.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        Customer tempCustomer = repo.findById(customer.getId()).orElse(null);
        if (tempCustomer!=null){
            tempCustomer.setName(customer.getName());
            tempCustomer.setAddress(customer.getAddress());
            tempCustomer.setSalary(customer.getSalary());
            return repo.save(tempCustomer);
        }else{
            return null;
        }
    }

    public boolean deleteCustomer(Integer id) {
        repo.deleteById(id);
        return true;
    }

    public Customer getCustomer(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public List<Customer> getAll() {
        return repo.findAll();
    }

}
