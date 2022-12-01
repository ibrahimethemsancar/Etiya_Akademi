package com.etiya.ecommercedemo5.api.controllers;

import com.etiya.ecommercedemo5.business.abtracts.ProductService;
import com.etiya.ecommercedemo5.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }
    @GetMapping("getAll")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable int id)
    {
        return productService.getById(id);
    }
    @GetMapping("id")
    public Product getByIdWithParam(@RequestParam int id)
    {
        return productService.getById(id);
    }
}
