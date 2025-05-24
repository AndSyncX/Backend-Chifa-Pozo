package com.jafp.chifapozo.infrastructure.persistence.mapper;

import com.jafp.chifapozo.domain.model.OrderItem;
import com.jafp.chifapozo.infrastructure.persistence.entity.OrderItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = DishMapper.class)
public interface OrderItemMapper {
    OrderItem toDomain(OrderItemEntity entity);
    OrderItemEntity toEntity(OrderItem domain);
}
