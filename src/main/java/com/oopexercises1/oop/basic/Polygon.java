package com.oopexercises1.oop.basic;

import java.awt.geom.Point2D;
import java.util.Arrays;

public class Polygon {
    private final Point2D.Double[] vertices;

    public Polygon(Point2D.Double[] vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("At least three vertices are required");
        }
        this.vertices = vertices;
    }

    public int getVerticesCount() {
        return vertices.length;
    }

    public double getPerimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            double resultTmp = Math.pow(vertices[next].x - vertices[i].x, 2) + Math.pow(vertices[next].y - vertices[i].y, 2);
            perimeter += Math.sqrt(resultTmp);
        }
        return perimeter;
    }

    public double getArea() {
        double area = 0.0;
        for (int i = 0; i < vertices.length - 1; i++) {
            int next = (i + 1) % vertices.length;
            area += vertices[next].x * vertices[i].y - vertices[next].y * vertices[i].x;
        }
        return Math.abs(area / 2);
    }

    @Override
    public String toString() {
        return "Polygon{" + "vertices=" + Arrays.toString(vertices) + '}';
    }
}
