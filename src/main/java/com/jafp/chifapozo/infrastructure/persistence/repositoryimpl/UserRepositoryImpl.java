package com.jafp.chifapozo.infrastructure.persistence.repositoryimpl;

import com.jafp.chifapozo.domain.model.User;
import com.jafp.chifapozo.domain.repository.UserRepository;
import com.jafp.chifapozo.infrastructure.persistence.entity.UserEntity;
import com.jafp.chifapozo.infrastructure.persistence.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userJpaRepository.findAll()
                .stream()
                .map(userMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userJpaRepository.findById(id).map(userMapper::toDomain);
    }

    @Override
    public User save(User user) {
        UserEntity savedEntity = userJpaRepository.save(userMapper.toEntity(user));
        return userMapper.toDomain(savedEntity);
    }

    @Override
    public void deleteById(Integer id) {
        userJpaRepository.deleteById(id);
    }
}
