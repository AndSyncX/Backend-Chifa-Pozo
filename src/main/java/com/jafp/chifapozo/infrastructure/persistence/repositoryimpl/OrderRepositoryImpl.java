package com.jafp.chifapozo.infrastructure.persistence.repositoryimpl;

import com.jafp.chifapozo.domain.model.Order;
import com.jafp.chifapozo.domain.repository.OrderRepository;
import com.jafp.chifapozo.infrastructure.persistence.entity.OrderEntity;
import com.jafp.chifapozo.infrastructure.persistence.mapper.OrderMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderJpaRepository jpaRepository;
    private final OrderMapper orderMapper;

    @Override
    public List<Order> findAll() {
        return jpaRepository.findAll().stream()
                .map(orderMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Order> findById(Integer id) {
        return jpaRepository.findById(id).map(orderMapper::toDomain);
    }

    @Override
    public Order save(Order order) {
        OrderEntity savedEntity = jpaRepository.save(orderMapper.toEntity(order));
        return orderMapper.toDomain(savedEntity);
    }

    @Override
    public void deleteById(Integer id) {
        jpaRepository.deleteById(id);
    }
}
