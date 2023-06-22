package com.exercise.unittesting.shoppingcart.models;

import java.util.List;

import lombok.Data;

@Data
public class Catalog {
    private String name;
    private List<Item> items;
}
