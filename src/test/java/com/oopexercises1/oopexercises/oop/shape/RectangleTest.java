package com.oopexercises1.oopexercises.oop.shape;

import com.oopexercises.oop.shape.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    public static final double DELTA = 1e-06;
    com.oopexercises.oop.shape.Rectangle square;   //rinominato il suo rectangle in square
    com.oopexercises.oop.shape.Rectangle rectangle;    //aggiunto

    @BeforeEach
    void setUp() {
        square = new com.oopexercises.oop.shape.Rectangle("s01", "#AA40FF", new Point(0, 10), new Point(10, 0));

        // aggiungere un test di un rettangolo vero: base != altezza
        rectangle = new Rectangle("s02", "#00FFFF", new Point(1, 10), new Point(6, 0));
    }

    @Test
    void setColor() {
        assertDoesNotThrow(() -> square.setColor("#000000"));
        assertDoesNotThrow(() -> square.setColor("#123456"));
        assertDoesNotThrow(() -> square.setColor("#ABCDEF"));
        assertThrows(IllegalArgumentException.class, () -> square.setColor("#ABCDEFF"));
        assertThrows(IllegalArgumentException.class, () -> square.setColor("#ABCDEG"));
        assertThrows(IllegalArgumentException.class, () -> square.setColor("#ABCDE"));

        // aggiunti test con lettere minuscole: tutte minuscole e mix minuscole-maiuscole
        assertThrows(IllegalArgumentException.class, () -> square.setColor("800080F"));
        assertDoesNotThrow(() -> square.setColor("#FF00ff"));
        assertDoesNotThrow(() -> square.setColor("#0000ff"));
    }

    @Test
    void getPerimeter() {
        assertEquals(40, square.getPerimeter(), DELTA);
        assertEquals(30, rectangle.getPerimeter(), DELTA);  //added
    }

    @Test
    void getArea() {
        assertEquals(100, square.getArea(), DELTA);
        assertEquals(50, rectangle.getArea(), DELTA);   //added
    }

    @Test
    void move() {
        square.move(new Point(-5, -5));
        assertEquals(new Point(5, -5), square.getBottomRight());
        assertEquals(new Point(-5, 5), square.getUpperLeft());


        rectangle.move(new Point(-1, -1)); //added
        assertEquals(new Point(5, -1), rectangle.getBottomRight());    //added
        assertEquals(new Point(0, 9), rectangle.getUpperLeft());  //added
    }

    @Test
    void resize() {
        square.resize(2);
        assertEquals(new Point(20, -10), square.getBottomRight());
        assertEquals(new Point(0, 10), square.getUpperLeft());

        rectangle.resize(3);
        assertEquals(new Point(16, -20), rectangle.getBottomRight());    //added
        assertEquals(new Point(1, 10), rectangle.getUpperLeft());   //added
    }
}