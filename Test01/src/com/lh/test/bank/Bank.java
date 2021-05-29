package com.lh.test.bank;

import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private static ReentrantLock lock = new ReentrantLock();

    public static void transfer(Account from, Account to){
        long transfer = Math.round(Math.random()*10);

        lock.lock();
        if(from.getMoney()-transfer > 0){
            from.setMoney(from.getMoney()-transfer);
            to.setMoney(to.getMoney()+transfer);
        }else{
            lock.unlock();
            return;
        }
        lock.unlock();

//        System.out.println(String.format("%s money:%s,%s money:%s,transfer:%s",from.getName(),from.getMoney(),to.getName(),to.getMoney(),transfer));
    }

}
