package com.oopexercises.oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray {
    static final int DEFAULT_CAPACITY = 4;
    private int[] v;

    public EnhancedResizableArray() {
        v = new int[DEFAULT_CAPACITY];
    }

    public int get(int index) {
        return v[index];
    }

    public void set(int index, int value) {
        if (index >= v.length) {
            int[] tmp = new int[2 * index];
            //Arrays.fill(tmp, 0); non serve perchè java setta automaticamente a 0 tutti gli elementi dell'array tmp
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[index] = value;
    }

    public boolean contains(int value) {
        Arrays.sort(v);
        return Arrays.binarySearch(v, value) >= 0;
    }

    public void fill(int value) {
        Arrays.fill(v, value);
    }

    public int length() {
        return v.length;
    }

    public int[] toArray() {
        int[] out = new int[v.length];
        System.arraycopy(v, 0, out, 0, out.length);
        return out;
    }
}
