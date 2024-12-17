package com.oopexercises.warmup;

import java.awt.geom.Point2D;

public class EstimatePI {

    public static Point2D.Double generatePoint() {
        double x = Math.random();
        double y = Math.random();
        return new Point2D.Double(x, y);
    }

    static boolean isInTheCircle(Point2D.Double point) {
        return point.distance(0, 0) <= 1;
    }

    public static void main(String[] args) {
        for (int i = 3; i < 25; i++) {
            long countPointInside = 0;
            long numberPoint = (long) Math.pow(2, i);

            for (long j = 0; j < numberPoint; j++) {
                Point2D.Double point = generatePoint();
                if (isInTheCircle(point)) {
                    countPointInside++;
                }
            }

            double estimate = (double) 4 * countPointInside / numberPoint;
            double error = (estimate - Math.PI) * 100 / Math.PI;

            System.out.printf("[trials = 2^%d] [error = %.8f pc] [estimate = %.16f]\n", i, error, estimate);
        }
    }
}
