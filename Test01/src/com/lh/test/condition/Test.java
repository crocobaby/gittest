package com.lh.test.condition;

import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args) {
        Goods goods = new Goods(20);
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
        List<Thread> list = new ArrayList<>();
        //10个消费者线程
        for(int i = 0; i < 10; i++){
            Thread thread = new Thread(consumer, "消费者"+i);
            list.add(thread);
        }
        //5个生产者线程
        for(int i = 0; i < 5; i++){
            Thread thread = new Thread(producer,"生产者"+i);
            list.add(thread);
        }
        for(Thread thread : list){
            thread.start();
        }
    }
}

