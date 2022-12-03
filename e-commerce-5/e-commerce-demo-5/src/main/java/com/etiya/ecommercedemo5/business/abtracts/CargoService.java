package com.etiya.ecommercedemo5.business.abtracts;

import com.etiya.ecommercedemo5.entities.concretes.Cargo;

import java.util.List;

public interface CargoService {
    List<Cargo> findAllCargosByGivenPice(int id);
    Cargo findByName(String name);
}
