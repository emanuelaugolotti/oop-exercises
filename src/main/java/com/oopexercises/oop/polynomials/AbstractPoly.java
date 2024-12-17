package com.oopexercises.oop.polynomials;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    protected double[] derive() {
        double[] out = new double[degree()];
        for (int i = 1; i < coefficients().length; i++) {
            out[i - 1] = coefficients()[i] * i;
        }
        return out;
    }

    public void checkDegree(double degree) {      //aggiunto, il prof non l'ha messo --> eventuale pull request
        if (degree < 0 || degree > degree()) {
            throw new IllegalArgumentException("Invalid degree");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        //if (o == null || !(o instanceof Poly p)) {
        if (!(o instanceof Poly p)) {   //la prima condizione si può rimuovere perchè è controllata da instanceof -->pull request eventuale
            return false;
        }
        return degree() == p.degree() && Arrays.equals(coefficients(), p.coefficients());
    }

    @Override
    public int hashCode() {
        return Objects.hash(degree(), Arrays.hashCode(coefficients()));
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Poly{");
        double[] arrayCoefficients = coefficients();
        for (int i = 0; i < arrayCoefficients.length; i++) {
            if (i != 0) {
                if (arrayCoefficients[i] > 0) {
                    sb.append("+ ").append(arrayCoefficients[i]).append(" * x^").append(i);
                } else {
                    sb.append("- ").append(Math.abs(arrayCoefficients[i])).append(" * x^").append(i);
                }
            } else {
                sb.append(arrayCoefficients[i]);
            }
            if (i < arrayCoefficients.length - 1) {
                sb.append(" ");
            }
        }
        return sb.append('}').toString();
    }
}
