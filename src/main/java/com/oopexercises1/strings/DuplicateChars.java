package com.oopexercises1.strings;

import java.util.Arrays;

public class DuplicateChars {

    static boolean isRecurringCharacter(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count > 1;
    }

    public static char[] duplicateChars(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (isRecurringCharacter(input, currentChar) && !sb.toString().contains(String.valueOf(currentChar))) {
                sb.append(currentChar);
            }
        }
        char[] out = sb.toString().toCharArray();
        Arrays.sort(out);
        return out;
    }
}