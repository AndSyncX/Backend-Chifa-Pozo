package com.jafp.chifapozo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderItem {
    private Integer id;
    private Dish dish;
    private Integer quantity;
    private Double price;

}
