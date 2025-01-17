package com.oopexercises.arrays;

public class MatchUp {
    public static int matchUp(int[] v1, int[] v2) {
        int count = 0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i] && Math.abs(v2[i] - v1[i]) < 3) {
                count++;
            }
        }
        return count;
    }
}
