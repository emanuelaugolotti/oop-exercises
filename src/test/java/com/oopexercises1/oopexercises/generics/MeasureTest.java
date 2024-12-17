package com.oopexercises1.oopexercises.generics;

import com.oopexercises.generics.Measure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeasureTest {

    @Test
    void measure() {
        Measure.Measurer<String> measurer = new Measure.Measurer<>() {
            @Override
            public double measure(String item) {
                return item.length();
            }
        };
        assertEquals("hard disk", Measure.max(new String[]{"cpu", "memory", "hard disk", "case"}, measurer));
        assertEquals("cpu", Measure.min(new String[]{"cpu", "memory", "hard disk", "case"}, measurer));
    }
}
