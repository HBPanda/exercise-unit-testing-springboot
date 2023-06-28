package com.exercise.unittesting.shoppingcart.interfaces;

import org.springframework.stereotype.Service;

import com.exercise.unittesting.shoppingcart.models.Catalog;
import com.exercise.unittesting.shoppingcart.models.Item;

@Service
public interface ShoppingcartService {
    
    public Item selectCatalogItem(Catalog catalog, String itemName);
    public boolean addToCart(Item item, Integer quantity);
    public boolean removeItemUnderCertainPrice(Integer priceThreshold);

}
