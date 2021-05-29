package com.lh.test.condition;

public class Consumer implements Runnable{
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            this.goods.getGoods();
        }
    }
}
