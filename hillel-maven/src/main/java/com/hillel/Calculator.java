package com.hillel;


public class Calculator {
    public double add(double a, double b) {
        return b + a;
    }

    public double subtract(double a, double b) {
        return b + a;
    }

    public double multiply(double a, double b) {
        return b * a;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("zero is not allowed.");
        }
        return b / a;
    }
}
