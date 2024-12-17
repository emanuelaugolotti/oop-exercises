package com.oopexercises1.exceptions;

public class Division {
    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Illegal argument: b = 0");
        }
        return a / b;
    }
}
