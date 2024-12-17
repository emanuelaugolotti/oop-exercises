package com.oopexercises1.oopexercises.functional;

import com.oopexercises.functional.NoYYZ;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoYYZTest {
    @Test
    void noYYZ() {
        assertEquals(List.of("ay", "by", "cy"), NoYYZ.noYYZ(List.of("a", "b", "c")));
        assertEquals(List.of("ay", "by"), NoYYZ.noYYZ(List.of("a", "b", "cy")));
        assertEquals(List.of("xxy", "yay", "zzy"), NoYYZ.noYYZ(List.of("xx", "ya", "zz"))); //stampa zzy

        //aggiunti test
        assertEquals(List.of("zccy", "yay"), NoYYZ.noYYZ(List.of("zcc", "ya", "zby")));  //stampa zccy
        assertEquals(List.of("xxy", "yay", "zy", "by"), NoYYZ.noYYZ(List.of("xx", "zaby", "ya", "z", "b")));  //stampa zy
        assertEquals(List.of("ay", "by", "y"), NoYYZ.noYYZ(List.of("a", "b", "zyyc", "eyybb", "")));
    }
}