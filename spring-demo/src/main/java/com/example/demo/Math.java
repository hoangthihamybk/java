package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("math")
//@Scope("prototype")
public class Math implements Subject{
    @Override
    public void title() {
        System.out.println("Mon Toan");
    }
}
