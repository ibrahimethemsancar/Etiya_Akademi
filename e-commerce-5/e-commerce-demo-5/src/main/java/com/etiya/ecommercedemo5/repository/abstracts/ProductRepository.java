package com.etiya.ecommercedemo5.repository.abstracts;

import com.etiya.ecommercedemo5.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    //stock sayısına göre

    List<Product> findAllProducstsByStockGreaterThanOrderByStockDesc(int stock);
}
