package com.jafp.chifapozo.interfaces.web;

import com.jafp.chifapozo.domain.model.Dish;
import com.jafp.chifapozo.domain.services.DishService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dishes")
public class DishController {

    private final DishService dishService;

    @GetMapping
    public List<Dish> getAllDishes() {
        return dishService.getAllDishes();
    }

    @GetMapping("/{id}")
    public Optional<Dish> getDishById(@PathVariable Integer id) {
        return dishService.getDishById(id);
    }

    @PostMapping
    public Dish createDish(@RequestBody Dish dish) {
        return dishService.createDish(dish);
    }

    @DeleteMapping("/{id}")
    public void deleteDish(@PathVariable Integer id) {
        dishService.deleteDish(id);
    }
}