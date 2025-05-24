package com.jafp.chifapozo.infrastructure.persistence.mapper;

import com.jafp.chifapozo.domain.model.Order;
import com.jafp.chifapozo.infrastructure.persistence.entity.OrderEntity;
import com.jafp.chifapozo.infrastructure.persistence.entity.OrderItemEntity;

import java.util.stream.Collectors;

public class OrderMapper {
    public static Order toDomain(OrderEntity entity) {
        return new Order(
                entity.getId(),
                UserMapper.toDomain(entity.getUser()),
                entity.getItems().stream()
                        .map(OrderItemMapper::toDomain)
                        .toList(),
                entity.getTotalAmount(),
                entity.getStatus(),
                entity.getOrderDate()
        );
    }

    public static OrderEntity toEntity(Order order) {
        OrderEntity entity = new OrderEntity();
        entity.setId(order.getId());
        entity.setUser(UserMapper.toEntity(order.getUser()));
        entity.setTotalAmount(order.getTotalAmount());
        entity.setStatus(order.getStatus());
        entity.setOrderDate(order.getOrderDate());

        var itemEntities = order.getItems().stream()
                .map(item -> {
                    OrderItemEntity itemEntity = OrderItemMapper.toEntity(item);
                    itemEntity.setOrder(entity);
                    return itemEntity;
                })
                .toList();

        entity.setItems(itemEntities);
        return entity;
    }
}
