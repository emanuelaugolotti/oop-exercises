package com.oopexercises.arrays;

import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original) {
        int[][] out = new int[original.length][]; // nelle prime [] ho il numero di righe dell'array
        // multidimensionale, nelle seconde quadre ho il numero di colonne dell'array multidimensionale

        for (int i = 0; i < original.length; i++) {
            // System.arraycopy() requires the destination array to be allocated manually
            out[i] = new int[original[i].length];
            System.arraycopy(original[i], 0, out[i], 0, original[i].length);

            // Alternative version: Arrays.copyOf() takes care of allocating the destination
            // copy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return out;
    }
}
