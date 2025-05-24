package com.jafp.chifapozo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Promotion {
    private Integer id;
    private String title;
    private String description;
    private String imageUrl;
    private Boolean active;
    private LocalDate startDate;
    private LocalDate endDate;
}
