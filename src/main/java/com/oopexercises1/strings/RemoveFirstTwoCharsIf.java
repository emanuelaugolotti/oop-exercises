package com.oopexercises1.strings;

public class RemoveFirstTwoCharsIf {
//    public static String removeFirstTwoCharsIfCharAt(String string) {
//        StringBuilder out = new StringBuilder();
//        if (!string.isEmpty() && string.charAt(0) == 'H') {
//            out.append(string.charAt((0)));
//        }
//        if (string.length() > 1 && string.charAt(1) == 'e') {
//            out.append((string.charAt(1)));
//        }
//        if (string.length() > 2) {
//            out.append(string, 2, string.length());
//        }
//        return out.toString();
//    }

    public static String removeFirstTwoCharsIfCharAt(String string) {   //Alternative method
        StringBuilder sb = new StringBuilder();
        switch (string.length()) {
            case 0 -> {
            }
            case 1 -> {
                if (string.charAt(0) == 'H')
                    //sb.append("H");
                    sb.append('H');

            }
            case 2 -> {
                if (string.charAt(0) == 'H')
                    //sb.append("H");
                    sb.append('H');
                if (string.charAt(1) == 'e')
                    //sb.append("e");
                    sb.append('e');

            }
            default -> {
                if (string.charAt(0) == 'H')
                    //sb.append("H");
                    sb.append('H');
                if (string.charAt(1) == 'e')
                    //sb.append("e");
                    sb.append('e');
                sb.append(string.substring(2));
            }
        }
        return sb.toString();
    }

    public static String removeFirstTwoCharsIfStringBuilder(String string) {
        StringBuilder out = new StringBuilder(string);
        if (!string.isEmpty() && string.charAt(0) != 'H') {
            out.deleteCharAt(0);
        }
        if (string.length() > 1 && string.charAt(1) != 'e') {
            out.deleteCharAt(1);
        }
        return out.toString();
    }
}