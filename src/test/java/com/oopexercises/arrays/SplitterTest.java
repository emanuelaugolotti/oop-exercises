package com.oopexercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitterTest {
    @Test
    public void splitter() {
        assertArrayEquals(new int[]{3, 2, 1}, Splitter.splitter(321));
        assertArrayEquals(new int[]{2, 3, 4, 4, 5, 6}, Splitter.splitter(234456));
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4}, Splitter.splitter(987654));
    }
}