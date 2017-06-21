package com.yinheng.synchronizedthread;

/**
 * Created by 尹恒 on 2017/6/19.
 */
public class TestSyncClass {
    public static void main(String[] args) {
        SyncClass syncClass = new SyncClass();
        Thread thread1 = new Thread(syncClass, "A");
        Thread thread2 = new Thread(syncClass, "B");
        thread1.start();
        thread2.start();

    }
}
