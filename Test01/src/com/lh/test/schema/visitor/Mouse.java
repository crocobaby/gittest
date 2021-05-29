package com.lh.test.schema.visitor;

public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }

    public void move(){
        System.out.println("移动鼠标");
    }
}
