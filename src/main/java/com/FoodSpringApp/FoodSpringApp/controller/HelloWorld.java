package com.FoodSpringApp.FoodSpringApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public String home() {
        return "Welcome to FoodSpringApp";
    }

    @GetMapping("/hola")
    public String holaMundo() {
        return "¡Hola Mundo!";
    }
}