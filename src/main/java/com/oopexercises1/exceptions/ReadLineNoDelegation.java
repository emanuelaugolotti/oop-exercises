package com.oopexercises1.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineNoDelegation {
    public static String readLineNoDelegation(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String firstLine = bufferedReader.readLine();
            return firstLine;
        } catch (IOException e) {
            return null;
        }
    }
}
