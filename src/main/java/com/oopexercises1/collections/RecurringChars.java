package com.oopexercises1.collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string) {
        Set<Character> out = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            if (i < string.length() - 1 && string.indexOf(string.charAt(i), i + 1) > 0) {
                out.add(string.charAt(i));
            }
        }
        return out;
    }
}
