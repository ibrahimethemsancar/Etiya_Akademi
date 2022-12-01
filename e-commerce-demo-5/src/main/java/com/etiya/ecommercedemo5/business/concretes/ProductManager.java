package com.etiya.ecommercedemo5.business.concretes;

import com.etiya.ecommercedemo5.business.abtracts.ProductService;
import com.etiya.ecommercedemo5.entities.concretes.Product;
import com.etiya.ecommercedemo5.repository.abstracts.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//allconstractor
public class ProductManager implements ProductService {
    private ProductRepository productRepository;
@Autowired
//spring ioc
    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(int id) {
        return productRepository.findById(id).orElseThrow();
    }
}
