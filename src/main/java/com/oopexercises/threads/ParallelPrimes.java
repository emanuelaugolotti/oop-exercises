package com.oopexercises.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelPrimes {

    private final static int POOL_SIZE = 4;

    public static class PrimeEngine implements Callable<List<Integer>> {
        int start;
        int end;

        public PrimeEngine(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public List<Integer> call() {
            List<Integer> result = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);

        List<Callable<List<Integer>>> callables = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            callables.add(new PrimeEngine(i * 1000, (i + 1) * 1000));
        }
        List<Future<List<Integer>>> futures = executor.invokeAll(callables);

        Thread.sleep(1000L);

        for (Future<List<Integer>> future : futures) {
            List<Integer> listPrimeNumbers = future.get();
            System.out.println(listPrimeNumbers);

//            for(Integer number : listPrimeNumbers) {
//                System.out.printf("%d, ", number);
//            }
//            System.out.print("\n\n");
        }

        executor.shutdown();
    }
}
