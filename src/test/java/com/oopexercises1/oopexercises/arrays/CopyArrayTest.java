package com.oopexercises1.oopexercises.arrays;

import com.oopexercises.arrays.CopyArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CopyArrayTest {

    @Test
    void copyArray() {
        assertArrayEquals(new double[]{1, 1, 1}, CopyArray.copyArray(new double[]{1, 1, 1}));
        assertArrayEquals(new double[]{5, 4, 3, 1}, CopyArray.copyArray(new double[]{5, 4, 3, 1}));
    }
}