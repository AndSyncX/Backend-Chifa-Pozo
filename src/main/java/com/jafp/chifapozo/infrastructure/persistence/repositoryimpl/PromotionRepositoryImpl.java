package com.jafp.chifapozo.infrastructure.persistence.repositoryimpl;

import com.jafp.chifapozo.domain.model.Promotion;
import com.jafp.chifapozo.domain.repository.PromotionRepository;
import com.jafp.chifapozo.infrastructure.persistence.mapper.PromotionMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class PromotionRepositoryImpl implements PromotionRepository {
    private final PromotionJpaRepository promotionJpaRepository;

    @Override
    public List<Promotion> findAll() {
        return promotionJpaRepository.findAll()
                .stream()
                .map(PromotionMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Promotion> findById(Integer id) {
        return promotionJpaRepository.findById(id).map(PromotionMapper::toDomain);
    }

    @Override
    public Promotion save(Promotion promotion) {
        return PromotionMapper.toDomain(promotionJpaRepository.save(PromotionMapper.toEntity(promotion)));
    }

    @Override
    public void deleteById(Integer id) {
        promotionJpaRepository.deleteById(id);
    }
}
