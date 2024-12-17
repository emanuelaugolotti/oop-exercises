package com.oopexercises1.exceptions;

import java.io.*;

public class ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String firstLine = bufferedReader.readLine();
            return firstLine;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
