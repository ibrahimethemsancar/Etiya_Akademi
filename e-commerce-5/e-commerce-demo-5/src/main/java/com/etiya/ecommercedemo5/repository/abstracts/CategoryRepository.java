package com.etiya.ecommercedemo5.repository.abstracts;

import com.etiya.ecommercedemo5.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {



}
