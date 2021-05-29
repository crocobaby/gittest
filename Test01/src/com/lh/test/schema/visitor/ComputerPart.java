package com.lh.test.schema.visitor;

public interface ComputerPart {

    public void accept(ComputerPartVisitor visitor);
}
