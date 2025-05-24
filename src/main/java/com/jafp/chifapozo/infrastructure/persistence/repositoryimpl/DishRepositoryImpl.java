package com.jafp.chifapozo.infrastructure.persistence.repositoryimpl;

import com.jafp.chifapozo.domain.model.Dish;
import com.jafp.chifapozo.domain.repository.DishRepository;
import com.jafp.chifapozo.infrastructure.persistence.entity.DishEntity;
import com.jafp.chifapozo.infrastructure.persistence.mapper.DishMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class DishRepositoryImpl implements DishRepository {

    private final DishJpaRepository dishJpaRepository;
    private final DishMapper dishMapper;

    @Override
    public List<Dish> findAll() {
        return dishJpaRepository.findAll()
                .stream()
                .map(dishMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Dish> findById(Integer id) {
        return dishJpaRepository.findById(id)
                .map(dishMapper::toDomain);
    }

    @Override
    public Dish save(Dish dish) {
        DishEntity savedEntity = dishJpaRepository.save(dishMapper.toEntity(dish));
        return dishMapper.toDomain(savedEntity);
    }

    @Override
    public void deleteById(Integer id) {
        dishJpaRepository.deleteById(id);
    }
}
