package com.etiya.ecommercedemo5.api.controllers;

import com.etiya.ecommercedemo5.business.concretes.OrderManager;
import com.etiya.ecommercedemo5.entities.concretes.Order;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/orders")

public class OrderController {
    private OrderManager orderManager;
    @GetMapping
    public List<Order> getAllOrders()
    {
        return orderManager.getAllOrders();
    }
    @GetMapping("/cargoname")
    public List<Order> getAllOrdersByCargoName(@RequestParam("cargoname") String name)
    {
        return orderManager.getAllOrdersByCargoName(name);
    }
    @GetMapping("/id")
    public List<Order> getAllOrdersByProductId(@RequestParam("id") int id)
    {
        return orderManager.getAllOrdersByProductId(id);
    }
}
