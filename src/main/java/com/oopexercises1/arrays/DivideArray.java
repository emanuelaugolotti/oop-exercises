package com.oopexercises1.arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor) {
        double[] arrayOut = new double[v.length];
        for (int i = 0; i < v.length; i++) {
            arrayOut[i] = v[i] / factor;
        }
        return arrayOut;
    }
}
