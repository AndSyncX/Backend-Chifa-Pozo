package com.jafp.chifapozo.infrastructure.persistence.mapper;

import com.jafp.chifapozo.domain.model.Order;
import com.jafp.chifapozo.infrastructure.persistence.entity.OrderEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = DishMapper.class)
public interface OrderMapper {
    Order toDomain(OrderEntity entity);
    OrderEntity toEntity(Order domain);
}
