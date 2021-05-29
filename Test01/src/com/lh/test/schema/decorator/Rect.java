package com.lh.test.schema.decorator;

public class Rect implements Shape{
    @Override
    public void draw() {
        System.out.println("draw rect");
    }
}
