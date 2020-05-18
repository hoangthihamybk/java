package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary //bean này sẽ được ưu tiên trong TH có nhiều bean cùng loại trong context
@Component("music")
public class Music implements Subject{
    @Override
    public void title() {
        System.out.println("Môn âm nhạc");
    }
}
