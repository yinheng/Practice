package com.yinheng.synchronizedthread;

/**
 * Created by 尹恒 on 2017/6/19.
 */
// 多个线程访问synchronized方法和非synchronized方法

public class Counter implements Runnable {
    private int count;

    public Counter() {
        count = 0;
    }

    public void countAdd() {
        synchronized(this) {
            for(int i = 0; i < 5; i ++) {
                System.out.println(Thread.currentThread().getName() + count ++);
            }
        }
    }

    public void printCount() {
        for(int i = 0; i < 5; i ++) {
            System.out.println(Thread.currentThread().getName() + "count:" + count);
        }
    }

    public void run() {
        if(Thread.currentThread().getName() == "A") {
            countAdd();
        }
        if(Thread.currentThread().getName() == "B") {
            printCount();
        }
    }
}
