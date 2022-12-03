package com.etiya.ecommercedemo5.business.concretes;

import com.etiya.ecommercedemo5.business.abtracts.CategoryService;
import com.etiya.ecommercedemo5.entities.concretes.Category;
import com.etiya.ecommercedemo5.repository.abstracts.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service


public class CategoryManager implements CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryManager(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
   @Autowired
    @Override
    public List<Category> getAll() {
    return categoryRepository.findAll();
    }

    @Override
    public Category getByd(int id) {
        return categoryRepository.findById(id).orElseThrow();
    }
}
