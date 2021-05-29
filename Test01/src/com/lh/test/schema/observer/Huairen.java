package com.lh.test.schema.observer;

public interface Huairen {
    /**
     * 新增观察者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知
     * @param msg
     */
    void notice(String msg);

}
