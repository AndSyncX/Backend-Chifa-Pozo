package com.jafp.chifapozo.domain.repository;

import com.jafp.chifapozo.domain.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    List<Order> findAll();
    Optional<Order> findById(Integer id);
    Order save(Order order);
    void deleteById(Integer id);
}
