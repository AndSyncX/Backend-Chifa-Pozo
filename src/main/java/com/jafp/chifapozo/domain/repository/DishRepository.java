package com.jafp.chifapozo.domain.repository;

import com.jafp.chifapozo.domain.model.Dish;

import java.util.List;
import java.util.Optional;

public interface DishRepository {
    List<Dish> findAll();
    Optional<Dish> findById(Integer id);
    Dish save(Dish dish);
    void deleteById(Integer id);
}
