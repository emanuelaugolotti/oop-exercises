package com.oopexercises1.arrays;

public class Splitter {

    public static int countDigits(int input) {
        int count = 0;
        while (input != 0) {
            input /= 10;
            count++;
        }
        return count;
    }

    public static int[] splitter(int input) {
        int size = countDigits(input);
        int[] arrayOut = new int[size];
        int i = 0;
        while (input > 0) {
            int divisor = (int) Math.pow(10, size - 1);
            arrayOut[i] = input / divisor;
            input %= divisor;
            i++;
            size--;
        }
        return arrayOut;
    }
}
