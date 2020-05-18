package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Subject sb = context.getBean(Subject.class);
        System.out.println(sb);
        sb.title();
        Student student = context.getBean(Student.class);
        System.out.println(student);
        System.out.println(student.subject);
        student.subject.title();

    }

}
