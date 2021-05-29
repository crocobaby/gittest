package com.lh.test.schema.visitor;

public class Computer implements ComputerPart{
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (int i=0;i<parts.length;i++){
            parts[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
