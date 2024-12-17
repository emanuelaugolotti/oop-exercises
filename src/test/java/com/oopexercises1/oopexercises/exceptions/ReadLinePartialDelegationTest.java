package com.oopexercises1.oopexercises.exceptions;

import com.oopexercises.exceptions.ReadLinePartialDelegation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReadLinePartialDelegationTest {
    @Test
    void readLinePartialDelegationTest() {
        assertThrows(RuntimeException.class, () -> ReadLinePartialDelegation.readLinePartialDelegation("src/main/resources/missing-file.txt"));
        assertEquals("aahing",ReadLinePartialDelegation.readLinePartialDelegation("C:\\Users\\emanu\\OneDrive\\Desktop\\ProgrammazioneAOggetti\\english-words.txt"));
    }
}