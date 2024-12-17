package com.oopexercises1.oopexercises.collections;

import com.oopexercises.collections.WordFrequency;
import com.oopexercises.collections.WordFrequencySorted;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordFrequencySortedTest {

    final String filename = "C:\\Users\\emanu\\OneDrive\\Desktop\\ProgrammazioneAOggetti\\james-joyce-ulysses.txt";

    @Test
    void mostFrequent() throws IOException {
        Map<String, Integer> wordFrequency = WordFrequency.wordFrequency(filename);
        Map<String, Integer> topFifty = WordFrequencySorted.mostFrequent(wordFrequency, 50);
        assertEquals(704, topFifty.get("one"));
        assertEquals(701, topFifty.get("but"));
        assertEquals(698, topFifty.get("have"));
        Map<String, Integer> lessFifty = WordFrequencySorted.lessFrequent(wordFrequency, 50);
        assertEquals(1, lessFifty.get("zulus"));
        assertEquals(1, lessFifty.get("blasts"));
        assertEquals(1, lessFifty.get("guards"));
    }
}