package com.lh.test.jvm;

public class StackError {

    private static int count = 0;
    public static void main(String[] args) {
        count++; //设置-Xss值不同，输出的最大值不同
        System.out.println(count);
        main(args);

//        new StackError().method();

    }

    public void method(){
        method();
    }

}
