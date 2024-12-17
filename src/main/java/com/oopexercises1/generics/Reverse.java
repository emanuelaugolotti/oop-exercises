package com.oopexercises1.generics;

import java.util.List;

//public class Reverse {
//    public static <T> void reverse(List<T> list) {
//        List<T> listTemp = new ArrayList<>();
//        for (T entry : list) {
//            listTemp.addFirst(entry);
//        }
//        list.clear();
//        list.addAll(listTemp);
//    }
//}

public class Reverse {
    public static <T> void reverse(List<T> list) {
        int end = list.size() - 1;
        for (int start = 0; start < Math.floorDiv(list.size(), 2); start++) {
            T tmp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, tmp);
            end--;
        }
    }
}
