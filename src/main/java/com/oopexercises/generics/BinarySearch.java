package com.oopexercises.generics;

public class BinarySearch {
    public static <T extends Comparable<T>> int find(T[] array, T key) {
        return BinarySearch(array, key, 0, array.length - 1);
    }

    static <T extends Comparable<T>> int BinarySearch(T[] array, T key, int start, int stop) {
        while (start <= stop) {
            int medianIndex = (start + stop) / 2;
            T median = array[medianIndex];
            if (median.compareTo(key) == 0) {
                return medianIndex;
            } else if (median.compareTo(key) < 0) {
                start = medianIndex + 1;
            } else {
                stop = medianIndex - 1;
            }
        }
        return -1;
    }
}
