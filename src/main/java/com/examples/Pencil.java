package com.examples;

import java.awt.*;

class Curve {
    public String draw() {
        return "standard curve";
    }
}
interface DrawingTool {
    public abstract String draw(Curve curve);
}

interface ColoredDrawingTool {
    public abstract void fillColor(Color color);
}
public class Pencil implements DrawingTool, ColoredDrawingTool {    //posso implementare più di una interfaccia

    @Override
    public String draw(Curve curve) {
        //
        return null;
    }

    @Override
     public void fillColor(Color color) {
        //
    }
}

interface Movable {
    void stepForward();
    void stepBackward();
    void turnLeft();
    void turnRight();
}

class Batman implements Movable {

    @Override
    public void stepForward() {

    }

    @Override
    public void stepBackward() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}


