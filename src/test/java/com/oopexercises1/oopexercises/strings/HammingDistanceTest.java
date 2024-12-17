package com.oopexercises1.oopexercises.strings;

import com.oopexercises.strings.HammingDistance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HammingDistanceTest {

    @Test
    void hammingDistance() throws Exception {
        assertEquals(1, HammingDistance.hammingDistance("nicola", "n1cola"));
        assertEquals(6, HammingDistance.hammingDistance("nicola", "zzzzzz"));
        assertEquals(0, HammingDistance.hammingDistance("nicola", "nicola"));
        assertEquals(-1, HammingDistance.hammingDistance("nicola", "nicol"));
    }
}
