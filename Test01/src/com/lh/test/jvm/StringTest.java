package com.lh.test.jvm;

public class StringTest {

    public static void main(String[] args) {
        //测试双亲委派，不会加载本地String类
        String str = new String();
        System.out.println("hello");

    }
}
