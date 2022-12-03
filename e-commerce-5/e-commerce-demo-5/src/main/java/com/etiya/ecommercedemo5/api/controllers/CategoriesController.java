package com.etiya.ecommercedemo5.api.controllers;

import com.etiya.ecommercedemo5.business.abtracts.CategoryService;
import com.etiya.ecommercedemo5.entities.concretes.Category;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {
    private CategoryService categoryService;
    @GetMapping("")
    public List<Category> getAll()
    {
        return categoryService.getAll();
    }

    @GetMapping("{id}")
    public Category getById(@PathVariable int id){
        return categoryService.getByd(id);
    }
}
