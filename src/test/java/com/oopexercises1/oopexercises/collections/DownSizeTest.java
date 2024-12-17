package com.oopexercises1.oopexercises.collections;

import com.oopexercises.collections.DownSize;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DownSizeTest {
    List<String> list;

    @Test
    void downsize() {
        list = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f"));
        DownSize.downsize(list, 2);
        assertEquals(List.of("a", "c", "e"), list);
        list = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f"));
        DownSize.downsize(list, 3);
        assertEquals(List.of("a", "b", "d", "e"), list);
        list = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f"));
        DownSize.downsize(list, 1);
        assertEquals(List.of(), list);

        //aggiunti due test per controllo valori nulli e negativi
        list = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f"));
        assertThrows(IllegalArgumentException.class, () -> DownSize.downsize(list, 0));
        assertThrows(IllegalArgumentException.class, () -> DownSize.downsize(list, -1));
    }
}