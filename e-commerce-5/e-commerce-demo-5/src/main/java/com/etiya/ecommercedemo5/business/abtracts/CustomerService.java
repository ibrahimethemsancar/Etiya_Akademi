package com.etiya.ecommercedemo5.business.abtracts;

import com.etiya.ecommercedemo5.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerByName(String name);
    Customer findCustomerByLastName(String name);
    List<Customer> findAll();

    List<Customer> findAllCustomersByIdOrderById(int id);
    Customer findById(int id);
}
