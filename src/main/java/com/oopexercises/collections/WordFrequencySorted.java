package com.oopexercises.collections;

import java.util.*;

public class WordFrequencySorted {

    private static Map<String, Integer> sortAndCut(Map<String, Integer> map, Comparator<Map.Entry<String, Integer>> c, int limit) {
        Map<String, Integer> mapOut = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, c);
        list = list.subList(0, limit);
        for (Map.Entry<String, Integer> element : list) {
            mapOut.put(element.getKey(), element.getValue());
        }
        return mapOut;
    }

    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit) {
        Comparator<Map.Entry<String, Integer>> comparatorAscendent = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        };
        return sortAndCut(map, comparatorAscendent, limit);
    }

    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit) {
        Comparator<Map.Entry<String, Integer>> comparatorDescendent = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        };
        return sortAndCut(map, comparatorDescendent, limit);
    }
}


//public class WordFrequencySorted {
//
//    private static Map<String, Integer> sortedList(Map<String, Integer> map, Comparator<Map.Entry<String, Integer>> c, int limit) {
//        Map<String, Integer> mapOut = new LinkedHashMap<>();
//        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
//        Collections.sort(list, c);
//        list = list.subList(0, limit - 1);
//        for (Map.Entry<String, Integer> element : list) {
//            mapOut.put(element.getKey(), element.getValue());
//        }
//        return mapOut;
//    }
//
//    static class SortAscendent implements Comparator<Map.Entry<String, Integer>> {
//
//        @Override
//        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//            return o2.getValue() - o1.getValue();
//        }
//    }
//
//    static class SortDescendent implements Comparator<Map.Entry<String, Integer>> {
//
//        @Override
//        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//            return o1.getValue() - o2.getValue();
//        }
//    }
//
//    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit) {
//        return sortedList(map, new SortAscendent(), limit);
//    }
//
//    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit) {
//        return sortedList(map, new SortDescendent(), limit);
//    }
//}