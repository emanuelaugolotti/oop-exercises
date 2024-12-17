package com.oopexercises1.generics;

public class Divide {
    public static <T extends Number> double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }
}