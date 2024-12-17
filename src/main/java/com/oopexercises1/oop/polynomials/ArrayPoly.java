package com.oopexercises1.oop.polynomials;

public class ArrayPoly extends AbstractPoly {
    double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double coefficient(int degree) {
        checkDegree(degree);    //added
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    @Override
    public int degree() {
        return coefficients().length - 1;
    }

    @Override
    public Poly derivative() {
        //eturn (Poly) new ArrayPoly(derive());
        return new ArrayPoly(derive());
    }
}
