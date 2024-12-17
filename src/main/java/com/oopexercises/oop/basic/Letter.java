package com.oopexercises.oop.basic;

public class Letter {
    private final String from;
    private final String to;

    private final StringBuilder lines;

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        lines = new StringBuilder();
    }

    public void addLine(String line) {
        lines.append(line).append('\n');
    }

    public String getText() {
        String start = "Dear " + to + ":\n\n";
        String end = "\nSincerely,\n\n" + from;
        return start + lines + end;
    }
}
