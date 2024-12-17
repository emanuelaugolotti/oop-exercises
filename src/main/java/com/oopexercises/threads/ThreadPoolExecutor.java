package com.oopexercises.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.random.RandomGenerator;

public class ThreadPoolExecutor {
    private final static int POOL_SIZE = 4;
    private final static int NUMBER_OF_TASKS = 8;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
        RandomGenerator randomGenerator = RandomGenerator.getDefault();

        for (int task = 0; task < NUMBER_OF_TASKS; task++) {
            int taskNumber = task;
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                long startTime = System.currentTimeMillis();
                System.out.println("START " + threadName + " task=" + taskNumber);
                try {
                    Thread.sleep(randomGenerator.nextLong(1000L));
                } catch (InterruptedException ignored) {
                }
                long endTime = System.currentTimeMillis();
                System.out.println("STOP " + threadName + " task=" + taskNumber + " t=" + (endTime - startTime) + " ms");
            });
        }

        executor.shutdown();
    }
}