package com.lh.test.condition;

public class Producer implements Runnable{
    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while(true){
            this.goods.setGoods("香奈儿");
        }
    }
}
