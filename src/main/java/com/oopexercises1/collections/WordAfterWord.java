package com.oopexercises1.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordAfterWord {
    public static String wordAfterWord(String filename, String word) throws IOException {
        List<String> lines = getLines(filename);
        TreeSet<String> treeSet = new TreeSet<>();
        for (String line : lines) {
            treeSet.addAll(lineToWords(line));
        }
        SortedSet<String> view = treeSet.tailSet(word);
        view.removeFirst();
        return view.getFirst();
    }

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}

