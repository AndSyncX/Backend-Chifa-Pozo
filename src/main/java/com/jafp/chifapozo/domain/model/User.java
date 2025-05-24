package com.jafp.chifapozo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
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
