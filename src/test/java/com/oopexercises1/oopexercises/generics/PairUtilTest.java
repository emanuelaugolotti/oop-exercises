package com.oopexercises1.oopexercises.generics;

import com.oopexercises.generics.Pair;
import com.oopexercises.generics.PairUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairUtilTest {
    @Test
    void swap() {
        Pair<Integer, String> src = new Pair<>(0, "nicola");
        Pair<String, Integer> dst = PairUtil.swap(src);
        assertEquals(0, dst.getSecond());
        assertEquals("nicola", dst.getFirst());
    }
}
