package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Math implements Subject{
    @Override
    public void title() {
        System.out.println("Mon Toan");
    }
}
