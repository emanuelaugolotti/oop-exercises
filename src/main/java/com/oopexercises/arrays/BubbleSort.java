package com.oopexercises.arrays;

public class BubbleSort {

    public static void swap(int[] v, int position) {
        int temp = v[position];
        v[position] = v[position + 1];
        v[position + 1] = temp;
    }

    public static void bubbleSort(int[] v) {
        int size = v.length;
        boolean ordered = false;
        while (size > 1 && !ordered) {
            ordered = true;
            for (int i = 0; i < size - 1; i++) {
                if (v[i] > v[i + 1]) {
                    swap(v, i);
                    ordered = false;
                }
            }
            size--;
        }
    }

    public static int[] bubbleSortCopy(int[] v) {
        int[] arrayCopy = new int[v.length];
        System.arraycopy(v, 0, arrayCopy, 0, v.length);
        bubbleSort(arrayCopy);
        return arrayCopy;
    }
}


