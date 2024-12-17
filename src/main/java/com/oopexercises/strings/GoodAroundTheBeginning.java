package com.oopexercises.strings;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String s) {
        boolean result1 = s.startsWith("good");
        boolean result2 = s.startsWith("good", 1);
        return result1 || result2;
    }
}
