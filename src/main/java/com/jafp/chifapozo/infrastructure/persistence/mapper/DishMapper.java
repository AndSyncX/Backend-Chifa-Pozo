package com.jafp.chifapozo.infrastructure.persistence.mapper;

import com.jafp.chifapozo.domain.model.Dish;
import com.jafp.chifapozo.infrastructure.persistence.entity.DishEntity;

public class DishMapper {
    public static Dish toDomain(DishEntity entity) {
        return new Dish(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getPrice(),
                entity.getImageUrl(),
                entity.getAvailable()
        );
    }

    public static DishEntity toEntity(Dish dish) {
        DishEntity entity = new DishEntity();
        entity.setId(dish.getId());
        entity.setName(dish.getName());
        entity.setDescription(dish.getDescription());
        entity.setPrice(dish.getPrice());
        entity.setImageUrl(dish.getImageUrl());
        entity.setAvailable(dish.getAvailable());
        return entity;
    }
}
