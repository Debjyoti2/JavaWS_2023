package com.thread.virtual_thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    static void main() throws InterruptedException {

        //Pattern 1 Of Creating Thread from Java 8
        Thread th1 = new Thread(()->{
            System.out.println("Pattern 1 Of Creating Thread");
        });
        th1.start();

        //Note : Old Thread all called now as Platform Thread..

        //Pattern 2 Of Creating Thread from Java 21
        Thread.ofPlatform().start(()->{
            System.out.println("Pattern 2 Of Creating Thread");
        });

        //Pattern 3 Of Creating Thread from Java 21
        Thread th3 = Thread.ofPlatform().unstarted(()->{
            System.out.println("Pattern 3 Of Creating Thread");
        });
        th3.start();

        Thread virtual = Thread.ofVirtual().unstarted(()->{
            System.out.println("Pattern 1 Of Creating Virtual Thread" + Thread.currentThread());
        });
        virtual.start();
        virtual.join();

        Thread.startVirtualThread(()->{
            System.out.println("Pattern 2 Of Creating Virtual Thread" + Thread.currentThread());
        });

        //executor service

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->{
            System.out.println("Creating PlatformThread/Old Thread using ExecutorService");
        });

        ExecutorService executorService1 = Executors.newVirtualThreadPerTaskExecutor();
        executorService1.execute(()->{
            System.out.println("Creating Virtual Thread using ExecutorService");
        });


    }


}
