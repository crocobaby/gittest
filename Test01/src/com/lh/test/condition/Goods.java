package com.lh.test.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Goods {
    private String name;
    private int count;
    private int maxCount;
    private Lock lock = new ReentrantLock();
    //消费者等待队列
    private Condition consumerCondition = lock.newCondition();
    //生产者等待队列
    private Condition producerCondition = lock.newCondition();
    public Goods(int maxCount){
        this.maxCount = maxCount;
    }
    //生产方法
    public void setGoods(String name){
        lock.lock();
        try{
            //当商品数量达到最大值，所有生产者线程进入生产者等待队列
            while(count == maxCount){
                System.out.println(Thread.currentThread().getName()+"达到产品上线，等会再生产");
                producerCondition.await();
            }
            Thread.sleep(1000);
            count++;
            this.name = name;
            System.out.println(Thread.currentThread().getName()+"生产"+toString());
            //唤醒所有消费者线程
            consumerCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void getGoods(){
        lock.lock();
        try{
            while(count == 0){
                System.out.println("还没有商品");
                consumerCondition.await();
            }
            Thread.sleep(1000);
            count--;
            System.out.println(Thread.currentThread().getName()+"消费"+toString());
            //唤醒所有生产者线程
            producerCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
