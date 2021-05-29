package com.lh.test;

public class InterruptTest {


    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++){
                    if(Thread.interrupted()){
                        System.out.println("线程已经被中断，退出执行");
                        break;
                    }

                    System.out.println("print:"+i);
                }
            }
        });
        t.start();

        t.interrupt();
//        System.out.println(t.isInterrupted());
//        System.out.println(t.isInterrupted());



    }

}
