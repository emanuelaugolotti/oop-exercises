package com.oopexercises1.oop.basic;

public class ClickCounter {
    private int value = 0;

    public ClickCounter() {
    }

    public int getValue() {
        return this.value;
    }

    public void click() {
        this.value += 1;
    }

    public void undo() {
        if (this.value > 0) {
            this.value -= 1;
        }
    }

    public void reset() {
        this.value = 0;
    }
}
