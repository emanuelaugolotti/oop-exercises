package com.oopexercises.generics;

import java.util.Iterator;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src) {
        StringBuilder sb = new StringBuilder();
        for (E e : src) {
            sb.append(e).append(", ");
        }
        return sb.toString();
    }
}
