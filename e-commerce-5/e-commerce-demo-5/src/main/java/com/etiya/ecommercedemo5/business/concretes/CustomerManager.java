package com.etiya.ecommercedemo5.business.concretes;

import com.etiya.ecommercedemo5.business.abtracts.CustomerService;
import com.etiya.ecommercedemo5.entities.concretes.Customer;
import com.etiya.ecommercedemo5.repository.abstracts.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerManager implements CustomerService {
    CustomerRepository customerRepository;

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer findCustomerByLastName(String name) {
        return customerRepository.findByLastname(name);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findAllCustomersByIdOrderById(int id) {
        return customerRepository.findAllCustomersByIdOrderById(id);
    }

    @Override
    public Customer findCustomerByName(String name) {
        return customerRepository.findByName(name);
    }
}
