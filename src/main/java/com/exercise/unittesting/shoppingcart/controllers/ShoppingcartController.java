package com.exercise.unittesting.shoppingcart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingcartController {
    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }
}
