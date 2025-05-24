package com.jafp.chifapozo.infrastructure.persistence.mapper;

import com.jafp.chifapozo.domain.model.Promotion;
import com.jafp.chifapozo.infrastructure.persistence.entity.PromotionEntity;

public class PromotionMapper {
    public static Promotion toDomain(PromotionEntity entity) {
        return new Promotion(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getImageUrl(),
                entity.getActive(),
                entity.getStartDate(),
                entity.getEndDate()
        );
    }

    public static PromotionEntity toEntity(Promotion promotion) {
        PromotionEntity entity = new PromotionEntity();
        entity.setId(promotion.getId());
        entity.setTitle(promotion.getTitle());
        entity.setDescription(promotion.getDescription());
        entity.setImageUrl(promotion.getImageUrl());
        entity.setActive(promotion.getActive());
        entity.setStartDate(promotion.getStartDate());
        entity.setEndDate(promotion.getEndDate());
        return entity;
    }
}
