package com.lh.test.schema.observer;

import java.util.ArrayList;
import java.util.List;

public class Xianfan2 implements Huairen{
    private List<Observer> list = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notice(String msg) {
        for (Observer observer:list){
            observer.update("goudan",msg);
        }
    }
}
