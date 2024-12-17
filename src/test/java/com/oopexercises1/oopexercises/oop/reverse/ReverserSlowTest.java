package com.oopexercises1.oopexercises.oop.reverse;

import com.oopexercises.oop.reverse.Reverser;
import com.oopexercises.oop.reverse.ReverserSlow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverserSlowTest {
    @Test
    void reverse() {
        Reverser r = new ReverserSlow();
        assertEquals("!dlroW olleH", r.reverse("Hello World!"));
    }

    //added tests
    @Test
    void reverse1() {
        Reverser r = new ReverserSlow();
        assertEquals("", r.reverse(""));
    }
}