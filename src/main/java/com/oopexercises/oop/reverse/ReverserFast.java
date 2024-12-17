package com.oopexercises.oop.reverse;

public class ReverserFast implements Reverser {

    @Override
    public String reverse(String string) {
        StringBuilder out = new StringBuilder(string);
        return out.reverse().toString();
    }
}
