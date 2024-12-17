package com.oopexercises.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {

    public static double randomizedValue(double value) {
        RandomGenerator generator = RandomGenerator.getDefault();
        double start = value - (value * 0.05);
        double end = value + (value * 0.05);
        return generator.nextDouble(start, end);
    }

    public static double[] fillArray(int size, double value, boolean addNoise) {
        double[] array = new double[size];
        if (!addNoise) {
            Arrays.fill(array, value);
        } else {
            for (int i = 0; i < size; i++) {
                array[i] = randomizedValue(value);
            }
        }
        return array;
    }
}
