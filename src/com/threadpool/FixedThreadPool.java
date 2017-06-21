package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 尹恒 on 2017/6/21.
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 10; i ++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("index:" + index);
                    try {
                        Thread.sleep(2000);
                    }catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
    }
}
