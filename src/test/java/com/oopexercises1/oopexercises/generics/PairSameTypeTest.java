package com.oopexercises1.oopexercises.generics;

import com.oopexercises.generics.PairSameType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairSameTypeTest {
    @Test
    void swap() {
        PairSameType<String> p1 = new PairSameType<>("nicola", "agata");
        assertEquals("agata", p1.getSecond());
        assertEquals("nicola", p1.getFirst());
        p1.swap();
        assertEquals("nicola", p1.getSecond());
        assertEquals("agata", p1.getFirst());
        PairSameType<Integer> p2 = new PairSameType<>(10, 20);
        assertEquals(10, p2.getFirst());
        assertEquals(20, p2.getSecond());
        p2.swap();
        assertEquals(20, p2.getFirst());
        assertEquals(10, p2.getSecond());
    }
}
