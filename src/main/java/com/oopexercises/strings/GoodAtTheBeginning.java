package com.oopexercises.strings;

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String s) {
        if (s.length() < 4) {
            return false;
        }
        return s.charAt(0) == 'g' && s.charAt(1) == 'o' && s.charAt(2) == 'o' && s.charAt(3) == 'd';

//        // Alternative method
//        return s.startsWith("good");
    }
}
