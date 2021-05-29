package com.lh.test.schema.factory;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(null == shape){
            return null;
        }else if("circle".equals(shape)){
            return new Circle();
        }else if("rect".equals(shape)){
            return new Rect();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        if(null == color){
            return null;
        }else if("red".equals(color)){
            return new Red();
        }else if("blue".equals(color)){
            return new Blue();
        }

        return null;
    }
}
