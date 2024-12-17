package com.oopexercises1.arrays;

public class DivideArrays {
    public static double[] divideArrays(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            return new double[0];
        }

        double[] arrayOut = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            arrayOut[i] = v1[i] / v2[i];
        }
        return arrayOut;
    }
}
