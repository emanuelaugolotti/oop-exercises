package com.oopexercises1.oopexercises.oop.polynomials;

import com.oopexercises.oop.polynomials.ArrayPoly;
import org.junit.jupiter.api.BeforeEach;

class ArrayPolyTest extends PolyTestBase {
    @BeforeEach
    void setUp() {
        p = new ArrayPoly(new double[]{1, 2, 3, 4});
    }
}