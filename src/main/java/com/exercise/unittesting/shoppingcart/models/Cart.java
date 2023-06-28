package com.exercise.unittesting.shoppingcart.models;

import java.util.List;

import lombok.Data;

@Data
public class Cart {
    private List<CartItem> items;

}
