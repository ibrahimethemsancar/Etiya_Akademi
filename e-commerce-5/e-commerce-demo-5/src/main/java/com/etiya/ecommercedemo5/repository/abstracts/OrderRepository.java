package com.etiya.ecommercedemo5.repository.abstracts;

import com.etiya.ecommercedemo5.entities.concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    List<Order> findAllOrdersByCargoName(String name);
//"select c from Customer c inner join c.orders o where c.id = :customerId and o.id = :orderId"
    @Query("select o from Order as o where id=:id ")
    List<Order> findOrdersByProductId(int id);
}
