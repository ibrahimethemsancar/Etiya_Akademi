package com.etiya.ecommercedemo5.repository.abstracts;

import com.etiya.ecommercedemo5.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    //SELECT c FROM Customer as c WHERE firstname=:name
    @Query("SELECT c FROM Customer as c WHERE first_name=:name")
    Customer findByName(String name);

    @Query("SELECT c FROM Customer as c WHERE last_name=:name")
    Customer findByLastname(String name);

    List<Customer> findAll();

    List<Customer> findAllCustomersByIdOrderById(int id);

    Customer findById(int id);
}
