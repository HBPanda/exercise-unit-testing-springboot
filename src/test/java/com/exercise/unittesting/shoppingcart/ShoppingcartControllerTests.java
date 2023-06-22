package com.exercise.unittesting.shoppingcart;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.Assert.*;

import com.exercise.unittesting.shoppingcart.interfaces.ShoppingcartService;
import com.exercise.unittesting.shoppingcart.models.Item;

@ExtendWith(SpringExtension.class)
@WebMvcTest
class ShoppingcartControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private ShoppingcartService shoppingcartService;

    @Test
    void selectItemFromCatalog() throws Exception {
        //Given
        String expectedName = "Lawn Chair";

        //When
        Item item = shoppingcartService.findCatalogItemByName("Lawn Chair");

        //Then
        assertEquals(expectedName, item.getName());
    }

    @Test
    void addToCartSuccessfully() throws Exception{
        //Given
        boolean expectedResult = true;
        Item item = new Item("Lawn Chair", 500);
        //When
        boolean actualResult = shoppingcartService.addToCart(item);
        //Then
        assertEquals(expectedResult, actualResult);
    }
}    

