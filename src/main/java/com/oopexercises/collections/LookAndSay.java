package com.oopexercises.collections;

import java.util.*;

public class LookAndSay {
    public static List<Long> lookAndSay(long n) {
        if (n < 1) {
            return new ArrayList<>();
        }

        List<Long> listOut = new ArrayList<>(List.of(1L));
        for (int i = 1; i < n; i++) {
            StringBuilder currentNumber = new StringBuilder(String.valueOf(listOut.get((int) i - 1)));
            StringBuilder numberToAdd = new StringBuilder();

            for (int index = 0; index < currentNumber.length(); index++) {
                char currentDigit = currentNumber.charAt(index);
                long count = 1L;
                while (index + 1 < currentNumber.length() && currentNumber.charAt(index + 1) == currentDigit) {
                    index++;
                    count++;
                }
                numberToAdd.append(count).append(currentDigit);
            }

            listOut.add(Long.valueOf(numberToAdd.toString()));
        }
        return listOut;
    }
}

