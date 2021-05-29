package com.lh.test.jvm;

public class StackTest {

    public void methodA(){
        int i =1;
        int j=2;

        methodB();

    }

    private void methodB() {
        int i = 10;
        int j = 20;

    }

    public static void main(String[] args) {

        new StackTest().methodA();
    }

}
