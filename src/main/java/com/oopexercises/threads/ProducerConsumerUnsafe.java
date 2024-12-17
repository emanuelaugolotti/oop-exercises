package com.oopexercises.threads;

import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedDeque;

import static java.lang.Thread.sleep;

public class ProducerConsumerUnsafe {
    static class ProducerUnsafe extends Thread {
        final Deque<Integer> deque;

        public ProducerUnsafe(Deque<Integer> deque) {
            super();
            this.deque = deque;
        }

        @Override
        public void run() {
            int element = 0;
            System.out.println("START thread producer");
            while (!interrupted()) {
                deque.add(element);
                element++;
            }
            System.out.println("STOP thread producer");
        }
    }

    static class ConsumerUnsafe extends Thread {
        final Deque<Integer> deque;

        public ConsumerUnsafe(Deque<Integer> deque) {
            super();
            this.deque = deque;
        }

        @Override
        public void run() {
            int count = 0;
            System.out.println("START thread consumer");
            while (!interrupted()) {
                try {
                    deque.remove();
                    count++;
                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
            }
            System.out.printf("Total number of consumed elements: %d\n", count);
            System.out.println("STOP thread consumer");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();

        ProducerUnsafe producer = new ProducerUnsafe(deque);
        ConsumerUnsafe consumer = new ConsumerUnsafe(deque);

        producer.start();
        consumer.start();

        Thread.sleep(100L);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();
    }
}