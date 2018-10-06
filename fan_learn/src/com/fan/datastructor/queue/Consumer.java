package com.fan.datastructor.queue;

import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<String> queue;

    Consumer(Queue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                String item = queue.poll();
                System.out.println("Consumer poll a item:" + item);
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}