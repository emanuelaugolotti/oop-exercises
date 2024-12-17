package com.oopexercises1.oopexercises.oop.polynomials;

import com.oopexercises.oop.polynomials.ListPoly;
import org.junit.jupiter.api.BeforeEach;

class ListPolyTest extends PolyTestBase {
    @BeforeEach
    void setUp() {
        p = new ListPoly(new double[]{1, 2, 3, 4});
    }
}