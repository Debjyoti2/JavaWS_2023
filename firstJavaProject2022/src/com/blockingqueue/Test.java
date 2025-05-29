package com.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    public static void main(String[] args) {

        BlockingQueue<String> blk = new ArrayBlockingQueue<>(3);
        Producer1 p1 = new Producer1(blk);

        Consumer1 c1 = new Consumer1(blk);

        p1.start();
        c1.start();

    }
}

class Producer1 extends Thread{

    BlockingQueue<String> blk;

    Producer1(BlockingQueue<String> blk){
        this.blk=blk;
    }

    @Override
    public void run(){
        int i=0;
        while (i<10){
            i++;
            try {
                blk.put(i+">>");
                System.out.println("Element Inserted : " + i+">>");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}

class Consumer1 extends Thread{

    BlockingQueue<String> blk;

    Consumer1(BlockingQueue<String> blk){
        this.blk=blk;
    }

    @Override
    public void run(){
        while (true){
            try {
                String element = blk.take();
                System.out.println("Element taken " + element);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
