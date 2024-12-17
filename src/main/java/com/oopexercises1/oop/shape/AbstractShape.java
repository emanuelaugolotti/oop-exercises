package com.oopexercises1.oop.shape;

public abstract class AbstractShape implements Computable, Movable, Resizable {
    protected String id;
    protected String color;

    private void checkColorString(String string) {
        if (string.length() != 7 || string.charAt(0) != '#') {
            throw new IllegalArgumentException("This string is not allowed for representing a color (#RRGGBB)");
        }
        for (char value : string.substring(1).toCharArray()) {
            if (!((value >= '0' && value <= '9') || (value >= 'A' && value <= 'F') || (value >= 'a' && value <= 'f'))) {
                throw new IllegalArgumentException("This string is not allowed for representing a color (#RRGGBB)");
            }
        }
    }

    // aggiunto controllo valori positivi per il metodo resize -- il prof non l'ha messo
    public void checkPositiveValue(double value) {
        if (value < 0.0) {
            throw new IllegalArgumentException("Negative values are not allowed for this operation");
        }
    }

    protected AbstractShape(String id, String color) {
        this.id = id;
        setColor(color);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        checkColorString(color);
        this.color = color;
    }
}
