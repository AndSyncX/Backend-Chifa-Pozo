package com.jafp.chifapozo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Integer id;
    private String fullName;
    private String email;
    private String password;
    private String role;
    private Boolean enabled;
    private LocalDateTime createdAt;
}
