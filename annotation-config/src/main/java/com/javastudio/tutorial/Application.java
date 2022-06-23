package com.javastudio.tutorial;

import com.javastudio.tutorial.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application {

    @Autowired
    ProductService productService;

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("application", Application.class).run();
    }

    public void run() {
        productService.findAll();
    }
}
