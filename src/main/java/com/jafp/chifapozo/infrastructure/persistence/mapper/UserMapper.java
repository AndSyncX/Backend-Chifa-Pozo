package com.jafp.chifapozo.infrastructure.persistence.mapper;

import com.jafp.chifapozo.domain.model.User;
import com.jafp.chifapozo.infrastructure.persistence.entity.UserEntity;

public class UserMapper {
    public static User toDomain(UserEntity entity) {
        return new User(
                entity.getId(),
                entity.getFullName(),
                entity.getEmail(),
                entity.getPassword(),
                entity.getRole(),
                entity.getEnabled(),
                entity.getCreatedAt()
        );
    }

    public static UserEntity toEntity(User user){
        UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setFullName(user.getFullName());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        entity.setRole(user.getRole());
        entity.setEnabled(user.getEnabled());
        entity.setCreatedAt(user.getCreatedAt());
        return entity;
    }
}
