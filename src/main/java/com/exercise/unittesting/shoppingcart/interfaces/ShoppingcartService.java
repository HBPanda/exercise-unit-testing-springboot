package com.exercise.unittesting.shoppingcart.interfaces;

import org.springframework.stereotype.Service;

import com.exercise.unittesting.shoppingcart.models.Item;

@Service
public interface ShoppingcartService {
    
    public Item findCatalogItemByName(String itemName);
    public boolean addToCart(Item item);

}
