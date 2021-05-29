package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class DemoApplication {
    public static List<byte[]> list = new ArrayList<>();
    public static AtomicInteger ai = new AtomicInteger();

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
    while(true){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DemoApplication.wasteMemory();
    }
//        byte[] strArr = new byte[2147483647];

//        for (int i = 0; ; i++) {
//            System.out.println("*********************i=" + i);
//            new Thread(() -> {
//                try {
//                    Thread.sleep(Integer.MAX_VALUE);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }, "" + i).start();
//        }
//
    }

    private static void wasteMemory(){
//        System.out.println("开始浪费内存...");
//        list.add(new byte[124*1024]);

//        list.add(new byte[100]);
//        wasteMemory();

        new Thread(()->{
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"+ai.getAndIncrement());
            while(true){}
        },"AAA").start();
    }

}
