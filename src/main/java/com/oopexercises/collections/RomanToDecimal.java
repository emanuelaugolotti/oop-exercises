package com.oopexercises.collections;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {

    public static Map<Character, Integer> conversionTable() {
        Map<Character, Integer> conversionTable = new HashMap<>();
        conversionTable.put('I', 1);
        conversionTable.put('V', 5);
        conversionTable.put('X', 10);
        conversionTable.put('L', 50);
        conversionTable.put('C', 100);
        conversionTable.put('D', 500);
        conversionTable.put('M', 1000);
        return conversionTable;
    }

    public static int romanToDecimal(String s) {
        if (s.isEmpty()) {  //aggiunto controllo stringa vuota
            return 0;
        }

        Map<Character, Integer> conversionTable = conversionTable();
        int decimalNumber = 0;
        int i;
        for (i = 0; i < s.length() - 1; i++) {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            if ((currentChar == 'I' && (nextChar == 'V' || nextChar == 'X')) || (currentChar == 'X' && (nextChar == 'L' || nextChar == 'C'))
                    || (currentChar == 'C' && (nextChar == 'D' || nextChar == 'M'))) {
                decimalNumber += (conversionTable.get(nextChar) - conversionTable.get(currentChar));
                i++;
            } else {
                decimalNumber += conversionTable.get(currentChar);
            }
        }
        if (i < s.length()) {
            decimalNumber += conversionTable.get(s.charAt(i));
        }
        return decimalNumber;
    }
}