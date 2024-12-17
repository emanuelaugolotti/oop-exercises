package com.oopexercises.arrays;

public class Fibonacci {
    public static long[] fibonacci(int n) {
        long[] out = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                out[i] = 0;
            } else if (i == 1) {
                out[i] = 1;
            } else {
                out[i] = out[i - 1] + out[i - 2];
            }
        }
        return out;
    }
}