package com.oopexercises.arrays;

public class CanBalance {
    static int getSum(int[] v, int start, int stop) {
        int sum = 0;
        for (int i = start; i < stop + 1; i++) {
            sum += v[i];
        }
        return sum;
    }

    public static boolean canBalance(int[] v) {
        if (v.length < 2) {
            return false;
        }
        for (int i = 0; i < v.length - 1; i++) {
            int sumSideLeft = getSum(v, 0, i);
            int sumSideRight = getSum(v, i + 1, v.length - 1);
            if (sumSideLeft == sumSideRight) {
                return true;
            }
        }
        return false;
    }
}
