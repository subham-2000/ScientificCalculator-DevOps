package com.example;

public class Calculator {

    // Square root function
    // change 1
    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(x);
    }

    // Factorial function
    public static long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of a negative number.");
        }
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // Natural logarithm function
    public static double ln(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is only defined for positive numbers.");
        }
        return Math.log(x);
    }

    // Power function
    public static double power(double x, double b) {
        return Math.pow(x, b);
    }
}
