package com.oopexercises1.oopexercises.strings;

import com.oopexercises.strings.Concatenate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatenateTest {
    @Test
    public void concatenate() {
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"Hello", " ", "World", "!"}));
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"H", "e", "llo", " ", "World!"}));
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"Hello World", "!"}));
    }
}
