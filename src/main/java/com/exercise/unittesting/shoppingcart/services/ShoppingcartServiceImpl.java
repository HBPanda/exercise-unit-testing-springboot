package com.exercise.unittesting.shoppingcart.services;

import org.springframework.stereotype.Service;

import com.exercise.unittesting.shoppingcart.interfaces.ShoppingcartService;
import com.exercise.unittesting.shoppingcart.models.Item;


@Service
public class ShoppingcartServiceImpl implements ShoppingcartService {

    @Override
    public Item findCatalogItemByName(String itemName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findCatalogItemByName'");
    }

    @Override
    public boolean addToCart(Item item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addToCart'");
    }

}
