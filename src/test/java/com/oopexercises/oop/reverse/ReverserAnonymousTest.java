package com.oopexercises.oop.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverserAnonymousTest {
    @Test
    void reverse() {
        Reverser anonymousClass = new Reverser() {
            @Override
            public String reverse(String string) {
                StringBuilder out = new StringBuilder(string);
                return out.reverse().toString();
            }
        };

        assertEquals("!dlroW olleH", anonymousClass.reverse("Hello World!"));
    }
}
