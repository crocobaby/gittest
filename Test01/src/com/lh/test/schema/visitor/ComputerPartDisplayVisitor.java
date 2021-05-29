package com.lh.test.schema.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(ComputerPart part) {
        if(part instanceof Mouse){
            System.out.println("display Mouse");
            ((Mouse) part).move();
        }else if(part instanceof Keyboard){
            System.out.println("display Keyboard");
        }else if(part instanceof Computer){
            System.out.println("display Computer");
        }

    }
}
