package com.lh.test.schema.factory;

public class Test {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        shapeFactory.getShape("circle").draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        colorFactory.getColor("red").fill();
    }

}
