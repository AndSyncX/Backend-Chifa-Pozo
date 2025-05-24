package com.jafp.chifapozo.infrastructure.persistence.mapper;

import com.jafp.chifapozo.domain.model.User;
import com.jafp.chifapozo.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = Mapper.class)
public interface UserMapper {
    User toDomain(UserEntity entity);
    UserEntity toEntity(User user);
}
