package com.fan.datastructor.queue;

import java.util.concurrent.*;

public class ConLinkedQueue {


    public static void main(String[] args) {

        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();

        Producer p1 = new Producer(queue);
        Producer p2 = new Producer(queue);
        Consumer c2 = new Consumer(queue);
        Consumer c3 = new Consumer(queue);

        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(p1);
        service.execute(p2);
        service.execute(c2);
        service.execute(c3);

    }
}

//add,offer add会返回异常，offer不会返回异常，只会返回true 或者false
//remove, poll, 删除第一个元素，remove 会返回异常，poll会返回null
//peek,element 队列头部查询元素。element 抛出异常，peek返回nulls