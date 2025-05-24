package com.jafp.chifapozo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    private Integer id;
    private User user;
    private List<OrderItem> items;
    private Double totalAmount;
    private String status;
    private LocalDateTime orderDate;
}
