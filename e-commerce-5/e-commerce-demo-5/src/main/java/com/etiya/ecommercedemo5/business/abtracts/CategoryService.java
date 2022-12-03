package com.etiya.ecommercedemo5.business.abtracts;

import com.etiya.ecommercedemo5.entities.concretes.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category getByd(int id);
}
