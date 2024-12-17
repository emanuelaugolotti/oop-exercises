package com.oopexercises1.oop.polynomials;

public interface Poly {
    public double coefficient(int degree);

    public double[] coefficients();

    public int degree();

    public Poly derivative();
}
