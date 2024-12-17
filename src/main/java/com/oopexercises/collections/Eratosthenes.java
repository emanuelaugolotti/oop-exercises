package com.oopexercises.collections;

import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n) {
        Set<Integer> primeNumbers = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            primeNumbers.add(i);
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            for (int numberToRemove = i + i; numberToRemove <= n; numberToRemove += i) {
                primeNumbers.remove(numberToRemove);
            }
        }
        return primeNumbers;
    }
}
