package com.oopexercises1.oopexercises.arrays;

import com.oopexercises.arrays.MatchUp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatchUpTest {
    @Test
    void matchUp() {
        assertEquals(2, MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        assertEquals(3, MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        assertEquals(2, MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));

        // aggiunti array in cui alcuni elementi del primo sono maggiori di quelli del secondo e/o hanno segno negativo
        // per controllare il Adfunzionamento del valore assoluto
        assertEquals(2, MatchUp.matchUp(new int[]{5, 7, 4, 9}, new int[]{2, 3, 3, 7}));
        assertEquals(3, MatchUp.matchUp(new int[]{-8, 2, -6, 5, 1}, new int[]{-6, 5, -5, 3, 1}));
    }
}