package com.etiya.ecommercedemo5.repository.abstracts;

import com.etiya.ecommercedemo5.entities.concretes.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CargoRepository extends JpaRepository<Cargo,Integer> {
    List<Cargo>  findAllCargosByPriceGreaterThanOrderByPriceDesc(int price);

    @Query("select c from Cargo as c WHERE name=:name")
    Cargo findByName(String name);
}
