package com.etiya.ecommercedemo5.api.controllers;

import com.etiya.ecommercedemo5.business.concretes.CustomerManager;
import com.etiya.ecommercedemo5.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {
    private CustomerManager customerManager;

    @GetMapping("/getByFirstName")
    public Customer findByName(@RequestParam("first_name") String name){
        return customerManager.findCustomerByName(name);
    }

    @GetMapping("/getByLastName")
    public Customer findByLastName(@RequestParam("last_name") String name){
        return customerManager.findCustomerByLastName(name);
    }
    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers(){
        return customerManager.findAll();
    }

    @GetMapping("/getAllCustomersById")
    public List<Customer> getAllCustomers(int id){
        return customerManager.findAllCustomersByIdOrderById(id);
    }

    @GetMapping("/getById")
    public Customer getCustomerById(@RequestParam("id") int id)
    {
        return customerManager.findById(id);
    }
}
