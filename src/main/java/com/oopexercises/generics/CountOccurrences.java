package com.oopexercises.generics;

import java.util.Objects;

public class CountOccurrences {
    public static <T> int countOccurrencesPlain(T[] src, T item) {
        int count = 0;
        for (T entry : src) {
            if ((Objects.nonNull(item) && item.equals(entry)) || (Objects.isNull(item) && Objects.isNull(entry))) {
                count++;
            }
        }
        return count;
    }

    public static <T> int countOccurrencesObjects(T[] src, T item) {
        int count = 0;
        for (T entry : src) {
            if (Objects.equals(item, entry)) {
                count++;
            }
        }
        return count;
    }
}
