package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    Subject subject;
    public Student(Subject subject){
    this.subject = subject;
    }

}
