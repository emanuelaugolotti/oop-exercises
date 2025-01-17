package com.oopexercises.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> mapOut = new HashMap<>();
        List<String> lines = getLines(filename);
        for (String line : lines) {
            List<String> words = lineToWords(line);
            for (String word : words) {
                int value = mapOut.getOrDefault(word, 0);
                mapOut.put(word, value + 1);
            }
        }
        return mapOut;
    }

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
