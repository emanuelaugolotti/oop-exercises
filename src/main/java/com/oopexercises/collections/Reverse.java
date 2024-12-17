package com.oopexercises.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class Reverse {
    public static void reverse(List<String> sentence) {
        Deque<String> stack = new ArrayDeque<>();
        for (Iterator<String> i = sentence.iterator(); i.hasNext(); ) {
            stack.push(sentence.removeFirst());
        }
        while (!stack.isEmpty()) {
            sentence.add(stack.poll());
        }
    }
}
