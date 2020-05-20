package com.example.demo;

import com.example.demo.other.Art;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.example.demo.other")
@SpringBootApplication(scanBasePackages = "com.example.demo.other")
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        //ví dụ về getBean
//        Subject sb = context.getBean(Subject.class);
//        System.out.println(sb);
//        sb.title();
//        Student student = context.getBean(Student.class);
//        System.out.println(student);
//        System.out.println(student.subject);
//        student.subject.title();
//        ----------------------------------------------
        //Ví dụ về ComponentScan và scanBasePackages
//        try {
//            Subject sb = context.getBean(Subject.class);
//            sb.title();
//        }catch (Exception e){
//            System.out.println("Bean không tồn tại");
//        }
//        try {
//            Art a = context.getBean(Art.class);
//            System.out.println(a);
//        }catch (Exception e){
//            System.out.println("Bean art không tồn tại");
//        }
//        -------------------------------------------------
        //

    }

}
