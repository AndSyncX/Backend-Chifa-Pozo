package com.jafp.chifapozo.domain.repository;

import com.jafp.chifapozo.domain.model.Promotion;

import java.util.List;
import java.util.Optional;

public interface PromotionRepository {
    List<Promotion> findAll();
    Optional<Promotion> findById(Integer id);
    Promotion save(Promotion promotion);
    void deleteById(Integer id);
}
