package com.oopexercises.arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        if (end - start <= 0 || start < 0 || end < 0) {
            return new String[0];
        }
        String[] out = new String[end - start];
        int index = 0;
        for (int count = start; count < end; count++) {
            if (count % 3 == 0 && count % 5 == 0) {
                out[index] = "FizzBuzz";
            } else if (count % 3 == 0) {
                out[index] = "Fizz";
            } else if (count % 5 == 0) {
                out[index] = "Buzz";
            } else {
                out[index] = Integer.toString(count);
            }
            index++;
        }
        return out;
    }
}
