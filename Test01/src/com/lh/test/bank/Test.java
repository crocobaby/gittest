package com.lh.test.bank;

public class Test {

    public static void main(String[] args) {

        Account a = new Account("A",100);
        Account b = new Account("b",100);

        while(true){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Bank.transfer(a,b);
                }
            },"A->B").start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    Bank.transfer(b,a);
                }
            },"B->A").start();

//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }

    }

}
