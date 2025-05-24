package com.jafp.chifapozo.infrastructure.persistence.mapper;

import com.jafp.chifapozo.domain.model.Dish;
import com.jafp.chifapozo.infrastructure.persistence.entity.DishEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = DishMapper.class)
public interface DishMapper {
    Dish toDomain(DishEntity entity);
    DishEntity toEntity(Dish dish);
}
