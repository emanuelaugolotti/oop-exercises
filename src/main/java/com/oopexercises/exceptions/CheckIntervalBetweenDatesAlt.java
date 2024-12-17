package com.oopexercises.exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end) {
        try {
            LocalDate beginDate = LocalDate.parse(begin);
            LocalDate endDate = LocalDate.parse(end);
            return beginDate.isBefore(endDate);
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
