package com.oopexercises1.strings;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoCharsCharAt(String string) {
        StringBuilder out = new StringBuilder();
        for (int i = 2; i < string.length(); i++) {
            out.append(string.charAt(i));
        }
        return out.toString();
    }

    public static String removeFirstTwoCharsStringBuilder(String string) {
        StringBuilder out = new StringBuilder(string);
        if (string.length() > 1) {
            out.delete(0, 2);
        }
        else if (string.length() == 1) {
            out.delete(0, 1);
        }
        return out.toString();

        // Alternative method
        //return new StringBuilder(string).delete(0, 2).toString();
    }
}
