package com.yinheng.synchronizedthread;

/**
 * Created by 尹恒 on 2017/6/19.
 */
public class TestCounter {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(counter, "A");
        Thread thread2 = new Thread(counter, "B");
        thread1.start();
        thread2.start();
    }
}
