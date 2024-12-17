package com.oopexercises1.oopexercises.oop.basic;

import com.oopexercises.oop.basic.Letter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterTest {

    @Test
    void getText() {
        Letter letter = new Letter("me", "you");
        letter.addLine("Hello");
        letter.addLine("World!");
        String dst = """
                Dear you:

                Hello
                World!

                Sincerely,

                me""";
        assertEquals(dst, letter.getText());
    }

    // test aggiunti
    @Test
    void getText1() {
        Letter letter = new Letter("me", "you");
        letter.addLine("Hi ***");
        String dst = """
                Dear you:

                Hi ***

                Sincerely,

                me""";

        String text1 = letter.getText();
        String text2 = letter.getText();
        assertEquals(dst, text1);
        assertEquals(dst, text2);
    }
}
