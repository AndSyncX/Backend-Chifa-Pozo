package com.jafp.chifapozo.infrastructure.persistence.mapper;

import com.jafp.chifapozo.domain.model.OrderItem;
import com.jafp.chifapozo.infrastructure.persistence.entity.OrderItemEntity;

public class OrderItemMapper {
    public static OrderItem toDomain(OrderItemEntity entity) {
        return new OrderItem(
                entity.getId(),
                DishMapper.toDomain(entity.getDish()),
                entity.getQuantity(),
                entity.getPrice()
        );
    }

    public static OrderItemEntity toEntity(OrderItem item) {
        OrderItemEntity entity = new OrderItemEntity();
        entity.setId(item.getId());
        entity.setDish(DishMapper.toEntity(item.getDish()));
        entity.setQuantity(item.getQuantity());
        entity.setPrice(item.getPrice());
        return entity;
    }
}
