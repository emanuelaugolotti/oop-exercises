package com.oopexercises1.threads;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import static java.lang.Thread.sleep;

public class ProducerConsumerSafe {

    static class ProducerSafe extends Thread {
        final Queue<Integer> queue;
        public ProducerSafe(Queue<Integer> queue) {
            super();
            this.queue = queue;
        }

        @Override
        public void run() {
            int element = 0;
            System.out.println("START thread producer");
            while(!isInterrupted()) {
                synchronized (queue) {
                    queue.add(element);
                    element++;
                }
            }
            System.out.println("STOP thread producer");
        }
    }

    static class ConsumerSafe extends Thread {
        final Queue<Integer> queue;

        public ConsumerSafe(Queue<Integer> queue) {
            super();
            this.queue = queue;
        }

        @Override
        public void run() {
            System.out.println("START thread consumer");
            int countElementsFetched = 0;
            while(!isInterrupted()) {
                synchronized (queue) {
                    try {
                        queue.remove();
                        countElementsFetched++;
                    } catch (NoSuchElementException ignored) {
                        Thread.yield();
                    }
                }
            }
            System.out.printf("Total number of consumed elements: %d\n", countElementsFetched);
            System.out.println("STOP thread consumer");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedList<>();

        ProducerSafe producer = new ProducerSafe(queue);
        ConsumerSafe consumer = new ConsumerSafe(queue);

        producer.start();
        consumer.start();

        sleep(100L);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();
    }
}