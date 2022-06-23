package com.javastudio.tutorial.repository;

import org.springframework.stereotype.Component;

@Component
public class ProductRepository {
    public void findAll() {
        System.out.println("It works!");
    }
}
