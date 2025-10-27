package com.fraction;

public class FractionPart {
    public static double fraction(double x) {
        return x - (int) x;
    }

    public static void main(String[] args) {
        double x = 15.3436456543;
        System.out.printf("%.3f%n", fraction(x));
    }
}
