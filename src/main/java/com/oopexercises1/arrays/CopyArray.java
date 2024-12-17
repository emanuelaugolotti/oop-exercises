package com.oopexercises1.arrays;

/*
public class CopyArray {
    public static double[] copyArray(double[] v) {
        //creo un array di tipi primitivi double vuoto
        double[] arraycopy = new double[v.length];

        //manual array copy
        for (int i = 0; i < v.length; i++) {
            arraycopy[i] = v[i];
        }
        return arraycopy;
    }
}
*/
public class CopyArray {
    public static double[] copyArray(double[] v) {
        //creo un array di tipi primitivi double vuoto
        double[] arraycopy = new double[v.length];

        //aystem array copy
        System.arraycopy(v, 0, arraycopy, 0, v.length);
        return arraycopy;
    }
}

