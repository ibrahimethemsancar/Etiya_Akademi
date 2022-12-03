package com.etiya.ecommercedemo5.business.abtracts;

import com.etiya.ecommercedemo5.entities.concretes.Order;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderService {
   List<Order> getAllOrders();
   List<Order> getAllOrdersByCargoName(String name);
   List<Order> getAllOrdersByProductId(int id);
}
