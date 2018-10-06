package com.fan.datastructor.queue;

import java.util.Queue;

public class Producer implements Runnable {

    private Queue<String> queue;

    Producer(Queue<String> queue) {
        this.queue = queue;
    }

    public void run() {

        while (true) {
            try {
                String item = String.valueOf(Math.floor(Math.random() * 10));
                boolean isSuccess = queue.offer(item);
                System.out.println("Producer offer a item:" + item + " status:" + isSuccess);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
