package com.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 尹恒 on 2017/6/21.
 */
public class CachedThreadPool {

    public static void main(String[] arg) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for(int i = 0; i < 5; i ++) {
            final int index = i;
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("index:" + index);
                }
            });
        }

    }

}
