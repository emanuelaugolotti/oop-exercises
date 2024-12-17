package com.oopexercises.exceptions;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String s) throws ParseException {
        if (s.length() < 2 || s.length() % 2 != 0) {
            throw new ParseException("Invalid length of string", -1);
        }
        int index = 0;
        for (char c : s.toCharArray()) {
            if (index % 2 == 0 && !Character.isLetter(c)) {
                throw new ParseException("Invalid format string: letter absent", index);
            }
            if (index % 2 != 0 && !Character.isDigit(c)) {
                throw new ParseException("Invalid format string: digit absent", index);
            }
            index++;
        }
    }
}

