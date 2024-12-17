package com.oopexercises1.oop.polynomials;

import java.util.ArrayList;

public class ListPoly extends AbstractPoly {

    ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>(coefficients.length);
        for (double coefficient : coefficients) {
            this.coefficients.add(coefficient);
        }
    }

    @Override
    public double coefficient(int degree) {
        checkDegree(degree);  //added
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] out = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            out[i] = coefficients.get(i);
        }
        return out;
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        //return (Poly) new ListPoly(derive());
        return new ListPoly(derive());
    }
}
