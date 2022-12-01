package com.etiya.ecommercedemo5.business.abtracts;

import com.etiya.ecommercedemo5.entities.concretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<Product> getAll();
    Product getById(int id);
}
