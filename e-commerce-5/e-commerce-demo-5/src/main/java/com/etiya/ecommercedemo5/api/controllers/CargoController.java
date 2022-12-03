package com.etiya.ecommercedemo5.api.controllers;

import com.etiya.ecommercedemo5.business.concretes.CargoManager;
import com.etiya.ecommercedemo5.entities.concretes.Cargo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cargos")
@AllArgsConstructor
public class CargoController {
    private CargoManager cargoManager;
    @GetMapping("/cargosbyprice")
    public List<Cargo> findCargosByGivenPrice(@RequestParam("price") int price)
    {
        return cargoManager.findAllCargosByGivenPice(price);
    }
    @GetMapping("/getcargobyname")
    public Cargo getCargoByName(@RequestParam("cargoname") String name){
        return  cargoManager.findByName(name);
    }
}
