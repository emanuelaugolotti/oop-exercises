package com.oopexercises.arrays;

public class TenRun {
    static boolean isMultipleOf10(int value) {
        return value != 0 && value % 10 == 0;
    }

    static int changeValues(int start, int[] v, int value) {
        int end = start;
        for (int i = start + 1; i < v.length; i++) {
            if (isMultipleOf10(v[i])) {
                end = i - 1;
                break;
            }
            v[i] = value;
        }
        return end;
    }

    public static int[] tenRun(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (isMultipleOf10(v[i])) {
                i = changeValues(i, v, v[i]);
            }
        }
        return v;
    }
}