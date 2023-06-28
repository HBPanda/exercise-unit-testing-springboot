package com.exercise.unittesting.shoppingcart.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CartItem {
    private Item item;
    private Integer quantity;
}
