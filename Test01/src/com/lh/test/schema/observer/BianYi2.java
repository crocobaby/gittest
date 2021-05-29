package com.lh.test.schema.observer;

public class BianYi2 implements Observer{
    private String bname = "王";

    @Override
    public void update(String name, String msg) {
        System.out.println(bname+":"+name+"哪里有情况，"+msg);
    }
}
