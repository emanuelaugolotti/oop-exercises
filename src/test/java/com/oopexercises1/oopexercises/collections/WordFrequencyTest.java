package com.oopexercises1.oopexercises.collections;

import com.oopexercises.collections.WordFrequency;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordFrequencyTest {

    final String filename = "C:\\Users\\emanu\\OneDrive\\Desktop\\ProgrammazioneAOggetti\\james-joyce-ulysses.txt";

    @Test
    void wordFrequency() throws IOException {
        assertEquals(1, WordFrequency.wordFrequency(filename).get("zulu"));
        assertEquals(2, WordFrequency.wordFrequency(filename).get("velocipedes"));
        assertEquals(3, WordFrequency.wordFrequency(filename).get("bachelor"));
    }
}
