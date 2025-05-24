package com.jafp.chifapozo.infrastructure.persistence.mapper;

import com.jafp.chifapozo.domain.model.Promotion;
import com.jafp.chifapozo.infrastructure.persistence.entity.PromotionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = DishMapper.class)
public interface PromotionMapper {
    Promotion toDomain(PromotionEntity entity);
    PromotionEntity toEntity(Promotion promotion);
}
