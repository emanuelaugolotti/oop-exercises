package com.oopexercises1.collections;

import java.util.Iterator;
import java.util.List;

public class DownSize {
    public static void downsize(List<String> list, int n) {
        //aggiunto controllo
        if (n < 1) {
            throw new IllegalArgumentException("Illegal intensity of the downsizing");
        }

        int index = 1;
        for (Iterator<String> i = list.iterator(); i.hasNext(); ) {
            i.next();
            if (index % n == 0) {
                i.remove();
            }
            index++;
        }
    }
}
