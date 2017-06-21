package com.yinheng.synchronizedthread;

/**
 * Created by 尹恒 on 2017/6/19.
 */
public class SyncThread implements Runnable {
    private int count;
    public SyncThread() {
        count = 0;
    }

    public void run() {
        synchronized(this) {
            for(int i = 0; i < 5; i ++) {
                System.out.println(Thread.currentThread().getName() + count++);
                try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
