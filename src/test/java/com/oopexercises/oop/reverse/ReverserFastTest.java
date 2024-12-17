package com.oopexercises.oop.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverserFastTest {
    @Test
    void reverse() {
        Reverser r = new ReverserFast();
        assertEquals("!dlroW olleH", r.reverse("Hello World!"));
    }

    //added tests
    @Test
    void reverse1() {
        Reverser r = new ReverserFast();
        assertEquals("", r.reverse(""));
    }
}
