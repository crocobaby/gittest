package com.lh.test.schema.observer;

public class Test {

    public static void main(String[] args) {

        Huairen hren = new Xianfan1();
        Observer observer1= new BianYi1();
        Observer observer2= new BianYi2();
        hren.addObserver(observer1);
        hren.addObserver(observer2);

        Huairen hren2 = new Xianfan2();
        hren2.addObserver(observer1);
        hren2.addObserver(observer2);

        hren.notice("老大来了");
        hren2.notice("老二来了");

    }


}
