package com.fan.datastructor.queue;

import java.util.Queue;
import java.util.concurrent.*;

public class LinkedBQueue {

    public static void main(String[] args) {

        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        ProducerBlocking p1 = new ProducerBlocking(queue);
        ProducerBlocking p2 = new ProducerBlocking(queue);
        ConsumerBlocking c2 = new ConsumerBlocking(queue);
        ConsumerBlocking c3 = new ConsumerBlocking(queue);

        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(p1);
        service.execute(p2);
        service.execute(c2);
        service.execute(c3);

    }


}

 class ProducerBlocking implements Runnable {

    private BlockingQueue<String> queue;

     ProducerBlocking(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {

        while (true) {
            try {
                String item = String.valueOf(Math.floor(Math.random() * 10));
                System.out.println("Producer putting.......");
                queue.put(item);
                System.out.println("Producer offer a item:" + item );
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ConsumerBlocking implements Runnable {
    private BlockingQueue<String> queue;

    ConsumerBlocking(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Consumer polling.......");
                String item = queue.take();
                System.out.println("Consumer poll a item:" + item);
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
