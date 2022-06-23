package com.javastudio.tutorial.service;

import com.javastudio.tutorial.api.ProductService;
import com.javastudio.tutorial.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void  findAll(){
        productRepository.findAll();
    }
}
