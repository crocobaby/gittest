package com.lh.test.schema.decorator;

public class Test {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

        Shape rect = new Rect();
        ShapeDecorator redRect = new RedShapeDecorator(rect);
        redRect.draw();
    }

}
