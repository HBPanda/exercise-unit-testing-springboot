package com.exercise.unittesting.shoppingcart.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.exercise.unittesting.shoppingcart.interfaces.ShoppingcartService;
import com.exercise.unittesting.shoppingcart.models.Cart;
import com.exercise.unittesting.shoppingcart.models.CartItem;
import com.exercise.unittesting.shoppingcart.models.Catalog;
import com.exercise.unittesting.shoppingcart.models.Item;


@Service
public class ShoppingcartServiceImpl implements ShoppingcartService {
    private static final Logger logger = LoggerFactory.getLogger(ShoppingcartService.class);
    private Cart cart;

    public ShoppingcartServiceImpl(){
        cart = new Cart();
        cart.setItems(new ArrayList<CartItem>());
    }
    @Override
    public Item selectCatalogItem(Catalog catalog, String itemName) {
        Item result = null;
        try {
            for(Item item : catalog.getItems()){
                if(item.getName().equals(itemName) ){
                    result = item;
                }
            }
        } catch (Exception e) {
            logger.error(e.toString(), e);
        }
        return result;
    }

    @Override
    public boolean addToCart(Item item, Integer quantity) {
        boolean result = false;
        try {
            List<CartItem> cartItems = cart.getItems();
            CartItem cartITemResult = null;
            // Check if item is already in cart
            for(CartItem cartItem : cartItems){
                if(cartItem.getItem().getName().equals(item.getName())){
                    cartITemResult = cartItem;
                }
            }
            //State that item is already found within cart
            if(cartITemResult != null){
                logger.info("Item already in cart!");
            }
            else{
                cartItems.add(new CartItem(item, quantity));
                result = true;
            }
        } catch (Exception e) {
            logger.error(e.toString(), e);
        }
        return result;
    }

    @Override
    public boolean removeItemUnderCertainPrice(Integer priceThreshold) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeItemUnderCertainPrice'");
    }


}
