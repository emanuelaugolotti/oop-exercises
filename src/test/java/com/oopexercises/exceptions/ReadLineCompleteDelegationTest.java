package com.oopexercises.exceptions;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReadLineCompleteDelegationTest {
    @Test
    void readLineCompleteDelegationTest() throws IOException {
        assertThrows(IOException.class, () -> ReadLineCompleteDelegation.readLineCompleteDelegation("src/main/resources/missing-file.txt"));
        assertEquals("aahing",ReadLineCompleteDelegation.readLineCompleteDelegation("C:\\Users\\emanu\\OneDrive\\Desktop\\ProgrammazioneAOggetti\\english-words.txt"));
    }
}