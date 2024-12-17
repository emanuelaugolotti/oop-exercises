package com.oopexercises1.exceptions;

public class CheckLicencePlate {
    public static void checkLicencePlate(String licence) {
        if (licence.length() != 7) {
            throw new IllegalArgumentException("Lenght must be 7");
        }
        int index = 0;
        for (char c : licence.toCharArray()) {
            if (index > 1 && index < 5) {
                if (!Character.isDigit(c)) {
                    throw new IllegalArgumentException("Invalid licence plate format");
                }
            } else {
                if (!Character.isLetter(c)) {
                    throw new IllegalArgumentException("Invalid licence plate format");
                }
            }
            index++;
        }
    }
}