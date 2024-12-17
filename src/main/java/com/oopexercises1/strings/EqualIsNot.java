package com.oopexercises1.strings;

public class EqualIsNot {

    public static int countString(String string, String substring) {
        int count = 0;
        int index = 0;
        while (index >= 0 && index < string.length()) {
            index = string.indexOf(substring, index);
            if (index >= 0) {
                count++;
                index += substring.length();
            }
        }
        return count;
    }

    public static boolean equalIsNot(String string) {
        if (string == null || string.isEmpty()) {
            return true;
        }
        int countIs = countString(string, "is");
        int countNot = countString(string, "not");
        return countIs == countNot;
    }
}
