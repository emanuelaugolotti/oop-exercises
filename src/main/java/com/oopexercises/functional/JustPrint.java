package com.oopexercises.functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
    public static <T> void justPrintList(List<T> list) {
        list.forEach(entry -> System.out.println("Hello " + entry + "!"));
    }

    public static <K, V> void justPrintMap(Map<K, V> map) {
        map.forEach((key, value) -> System.out.println("k:" + key + ", v:" + value));
    }
}
