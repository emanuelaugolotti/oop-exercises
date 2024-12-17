package com.oopexercises1.oopexercises.collections;

import com.oopexercises.collections.WordAfterWord;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordAfterWordTest {
    final String filename = "C:\\Users\\emanu\\OneDrive\\Desktop\\ProgrammazioneAOggetti\\james-joyce-ulysses.txt";

    @Test
    void wordFrequency() throws IOException {
        assertEquals("yesterdays", WordAfterWord.wordAfterWord(filename, "yesterday"));
        assertEquals("gold", WordAfterWord.wordAfterWord(filename, "goings"));
        assertEquals("zero", WordAfterWord.wordAfterWord(filename, "zermatt"));
    }
}
