package com.exercise.unittesting.shoppingcart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import com.exercise.unittesting.shoppingcart.interfaces.ShoppingcartService;
import com.exercise.unittesting.shoppingcart.models.Catalog;
import com.exercise.unittesting.shoppingcart.models.Item;
import com.exercise.unittesting.shoppingcart.services.ShoppingcartServiceImpl;

@SpringBootTest
class ShoppingcartServiceTests {

    private ShoppingcartService service;
    @BeforeEach
    public void setup() {
        service = new ShoppingcartServiceImpl();
    }

    @Test
    void selectItemFromCatalogSuccessfully() throws Exception {
        //Given
        String expectedName = "Lawn Chair";

        Catalog catalog = new Catalog();
        List<Item> items = new ArrayList<Item>();
        catalog.setItems(items);
        items.add(new Item("Lawn Chair", 500));
        
        //When
        Item item = service.selectCatalogItem(catalog, "Lawn Chair");

        //Then
        assertEquals(expectedName, item.getName());
    }

    @Test
    void addToCartSuccessfully() throws Exception{
        //Given
        boolean expectedResult = true;
        Item item = new Item("Lawn Chair", 500);
        //When
        boolean actualResult = service.addToCart(item, 1);
        //Then
        assertEquals(expectedResult, actualResult);
    }
}    

