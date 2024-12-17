package com.oopexercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReadLineNoDelegationTest {
    @Test
    void noDelegation() {
        assertNull(ReadLineNoDelegation.readLineNoDelegation("src/main/resources/missing-file.txt"));
        assertEquals("aahing",ReadLineNoDelegation.readLineNoDelegation("C:\\Users\\emanu\\OneDrive\\Desktop\\ProgrammazioneAOggetti\\english-words.txt"));
    }
}