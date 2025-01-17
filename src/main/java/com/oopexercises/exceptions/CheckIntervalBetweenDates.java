package com.oopexercises.exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) {
        LocalDate date1 = LocalDate.parse(begin);
        LocalDate date2 = LocalDate.parse(end);
        return date1.isBefore(date2);
    }
}