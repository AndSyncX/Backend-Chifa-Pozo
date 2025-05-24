package com.jafp.chifapozo.infrastructure.persistence.repositoryimpl;

import com.jafp.chifapozo.domain.model.Dish;
import com.jafp.chifapozo.domain.repository.DishRepository;
import com.jafp.chifapozo.infrastructure.persistence.mapper.DishMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class DishRepositoryImpl implements DishRepository {
    private final DishJpaRepository dishJpaRepository;

    @Override
    public List<Dish> findAll() {
        return dishJpaRepository.findAll()
                .stream()
                .map(DishMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Dish> findById(Integer id) {
        return dishJpaRepository.findById(id).map(DishMapper::toDomain);
    }

    @Override
    public Dish save(Dish dish) {
        return DishMapper.toDomain(dishJpaRepository.save(DishMapper.toEntity(dish)));
    }

    @Override
    public void deleteById(Integer id) {
        dishJpaRepository.deleteById(id);
    }
}
