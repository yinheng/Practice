package com.yinheng.synchronizedthread;

/**
 * Created by 尹恒 on 2017/6/19.
 */
//synchronized 修饰一个类
public class SyncClass implements Runnable {
    private int count;

    public SyncClass() {
        count = 0;
    }

    public void countAdd() {
        synchronized(SyncClass.class) {
            for(int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + count);
            }
        }
    }

    public void printCount() {
        System.out.println(Thread.currentThread().getName() + "count:" + count);
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
