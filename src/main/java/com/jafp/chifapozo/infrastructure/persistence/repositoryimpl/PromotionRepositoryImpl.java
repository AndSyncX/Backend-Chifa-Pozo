package com.jafp.chifapozo.infrastructure.persistence.repositoryimpl;

import com.jafp.chifapozo.domain.model.Promotion;
import com.jafp.chifapozo.domain.repository.PromotionRepository;
import com.jafp.chifapozo.infrastructure.persistence.entity.PromotionEntity;
import com.jafp.chifapozo.infrastructure.persistence.mapper.PromotionMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class PromotionRepositoryImpl implements PromotionRepository {

    private final PromotionJpaRepository promotionJpaRepository;
    private final PromotionMapper promotionMapper;

    @Override
    public List<Promotion> findAll() {
        return promotionJpaRepository.findAll()
                .stream()
                .map(promotionMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Promotion> findById(Integer id) {
        return promotionJpaRepository.findById(id)
                .map(promotionMapper::toDomain);
    }

    @Override
    public Promotion save(Promotion promotion) {
        PromotionEntity savedEntity = promotionJpaRepository.save(promotionMapper.toEntity(promotion));
        return promotionMapper.toDomain(savedEntity);
    }

    @Override
    public void deleteById(Integer id) {
        promotionJpaRepository.deleteById(id);
    }
}
