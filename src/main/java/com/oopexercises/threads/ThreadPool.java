package com.oopexercises.threads;

import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPool extends Thread {
    private static final int N = 8;

    public ThreadPool(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("START thread=Thread-" + getName() + " task=" + getName());
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        long randomTime = randomGenerator.nextLong(1000L);
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(randomTime);
        } catch (InterruptedException ignored) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println("STOP thread=Thread-" + getName() + " task=" + getName() +
                " t=" + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[N];

        for (int i = 0; i < N; i++) {
            threads[i] = new ThreadPool(Integer.toString(i));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }
}