package com.jafp.chifapozo.infrastructure.persistence.repositoryimpl;

import com.jafp.chifapozo.domain.model.User;
import com.jafp.chifapozo.infrastructure.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<UserEntity, Integer> {
    Optional<User> findById(String email);
}
