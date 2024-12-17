package com.oopexercises1.oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {
    Point upperLeft;
    Point bottomRight;

    public Rectangle(String id, String color, Point upperLeft, Point bottomRight) {
        super(id, color);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    private double getBase() {
        return bottomRight.getX() - upperLeft.getX();
    }

    private double getHeight() {
        return upperLeft.getY() - bottomRight.getY();
    }

    @Override
    public double getArea() {
        return getBase() * getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getBase() + getHeight());
    }

    @Override
    public void move(Point movement) {
        upperLeft.translate((int) movement.getX(), (int) movement.getY());
        bottomRight.translate((int) movement.getX(), (int) movement.getY());
    }

    @Override
    public void resize(double scale) {
        checkPositiveValue(scale);  //il prof non l'ha messo
        //il centro della trasformazione è il punto in alto a sinistra, ossia il punto upperLeft --> eventuale pullrequest per modificare il testo
        //dell'esercizio e il javaDoc
        bottomRight.setLocation(upperLeft.getX() + scale * getBase(), upperLeft.getY() - scale * getHeight());
    }

    @Override
    public String toString() {
        return "Rectangle{" + "bottomRight=" + bottomRight + ", id='" + id + '\'' + ", color='" + color + '\'' + '}';
    }
}
