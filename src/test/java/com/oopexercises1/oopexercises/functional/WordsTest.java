package com.oopexercises1.oopexercises.functional;

import com.oopexercises.functional.Words;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsTest {
    final String filename = "C:\\Users\\emanu\\OneDrive\\Desktop\\ProgrammazioneAOggetti\\james-joyce-ulysses.txt";

    @Test
    void howManyLines() throws IOException {
        assertEquals(9, Words.howManyLines(filename, "pride"));
        assertEquals(1, Words.howManyLines(filename, "prejudice"));
        assertEquals(12939, Words.howManyLines(filename, "the"));
    }

    @Test
    void howManyTimes() throws IOException {
        assertEquals(10, Words.howManyTimes(filename, "pride"));
        assertEquals(1, Words.howManyTimes(filename, "prejudice"));
        assertEquals(15107, Words.howManyTimes(filename, "the"));
    }
}
