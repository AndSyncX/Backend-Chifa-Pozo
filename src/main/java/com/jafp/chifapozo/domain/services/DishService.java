package com.jafp.chifapozo.domain.services;

import com.jafp.chifapozo.domain.model.Dish;
import com.jafp.chifapozo.domain.repository.DishRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DishService {
    private final DishRepository dishRepository;

    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    public Optional<Dish> getDishById(Integer id) {
        return dishRepository.findById(id);
    }

    public Dish createDish(Dish dish) {
        return dishRepository.save(dish);
    }

    public void deleteDish(Integer id) {
        dishRepository.deleteById(id);
    }
}
