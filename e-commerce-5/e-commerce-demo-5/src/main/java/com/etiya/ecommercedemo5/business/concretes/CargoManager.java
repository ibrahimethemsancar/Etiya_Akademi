package com.etiya.ecommercedemo5.business.concretes;

import com.etiya.ecommercedemo5.business.abtracts.CargoService;
import com.etiya.ecommercedemo5.entities.concretes.Cargo;
import com.etiya.ecommercedemo5.repository.abstracts.CargoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CargoManager implements CargoService {
    CargoRepository cargoRepository;
    @Override
    public List<Cargo> findAllCargosByGivenPice(int price) {
        return cargoRepository.findAllCargosByPriceGreaterThanOrderByPriceDesc(price);
    }

    @Override
    public Cargo findByName(String name) {
        return cargoRepository.findByName(name);
    }
}
