package com.oopexercises1.strings;

public class Reverse {

//    public static String reverseCharAt(String string) {   //alternative method
//        // This method has to use only String's methods (see String.charAt())
//        String out = "";
//        for (int i = string.length() - 1; i >= 0; i--) {
//            out += string.charAt(i);
//        }
//        return out;
//    }

    public static String reverseCharAt(String string) {
        // This method has to use only String's methods (see String.charAt())
        StringBuilder out = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            out.append(string.charAt(i));
        }
        return out.toString();
    }

    public static String reverseStringBuilder(String string) {
        // This method has to use StringBuilder's methods (see StringBuilder.reverse())
        StringBuilder out = new StringBuilder(string);
        out.reverse();
        return out.toString();
    }
}
