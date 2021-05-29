package com.lh.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {

    public void test() throws Exception {
        final Lock lock = new ReentrantLock();
        lock.lock();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //主线程已经执行完毕的时候还会阻塞咋这里
//                lock.lock();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " sleep interrupted.");

                    //收到中断信号后，线程继续往下执行不执行自己决定
                    return;
                }

//                try {
//                    //其他线程调用该线程的 interrupt方法，该线程会中断
//                    lock.lockInterruptibly();
//                } catch (InterruptedException e) {
//                    System.out.println(Thread.currentThread().getName() + "lock interrupted.");
//
//                }

                System.out.println("我会执行吗？");
            }
        }, "child thread -1");

        t1.start();
        Thread.sleep(1000);

        t1.interrupt();

        Thread.sleep(10000);
    }

    public static void main(String[] args) throws Exception {
        new TestReentrantLock().test();
        System.out.println("执行完毕。。。");
    }

}
