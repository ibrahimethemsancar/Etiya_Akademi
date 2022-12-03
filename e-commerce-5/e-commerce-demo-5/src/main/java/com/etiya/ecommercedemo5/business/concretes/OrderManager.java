package com.etiya.ecommercedemo5.business.concretes;

import com.etiya.ecommercedemo5.business.abtracts.OrderService;
import com.etiya.ecommercedemo5.entities.concretes.Order;
import com.etiya.ecommercedemo5.repository.abstracts.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class OrderManager implements OrderService {
    private OrderRepository orderRepository;
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> getAllOrdersByCargoName(String name) {
        return orderRepository.findAllOrdersByCargoName(name);
    }

    @Override
    public List<Order> getAllOrdersByProductId(int id) {
        return orderRepository.findOrdersByProductId(id);
    }
}
