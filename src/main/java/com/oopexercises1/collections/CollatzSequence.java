package com.oopexercises1.collections;

import java.util.*;

public class CollatzSequence {
    public static List<Long> collatzSequence(long n) {
        if (n < 1) {
            return new ArrayList<>();
        }
        List<Long> collatzSequence = new ArrayList<>(List.of(n));
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            collatzSequence.add(n);
        }
        return collatzSequence;
    }
}
