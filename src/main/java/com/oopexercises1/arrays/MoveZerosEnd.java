package com.oopexercises1.arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v) {
        int currentPositionNonZeroElements = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0 && i != currentPositionNonZeroElements) {
                int temp = v[currentPositionNonZeroElements];
                v[currentPositionNonZeroElements] = v[i];
                v[i] = temp;
                currentPositionNonZeroElements++;
            }
        }
        return v;
    }
}
