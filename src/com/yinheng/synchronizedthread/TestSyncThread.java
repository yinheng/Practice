package com.yinheng.synchronizedthread;

/**
 * Created by 尹恒 on 2017/6/19.
 */
public class TestSyncThread {

    public static void main(String[] args) {
        SyncThread syncThread = new SyncThread();
        Thread thread1 = new Thread(syncThread, "syncThread1:");
        Thread thread2 = new Thread(syncThread, "syncThread2:");

        thread1.start();
        thread2.start();
    }
}
