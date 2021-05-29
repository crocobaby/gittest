package com.lh.test.jvm;

public class Test {
    private static int i = 1;

    static{
        i = 2;
        b=20;
    }

    private static int b= 10;

    public static void main(String[] args) {

        System.out.println(Test.i);

    }


}
