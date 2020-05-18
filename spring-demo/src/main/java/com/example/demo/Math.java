package com.example.demo;

import org.springframework.stereotype.Component;

@Component("math")
//@Scope("prototype")
public class Math implements Subject{
    @Override
    public void title() {
        System.out.println("Mon Toan");
    }
}
