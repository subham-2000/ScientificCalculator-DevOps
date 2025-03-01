package com.example;

import java.util.Scanner;

    public class Calculator {

        // Square root function
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

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nScientific Calculator");
                System.out.println("1. Square root (√x)");
                System.out.println("2. Factorial (x!)");
                System.out.println("3. Natural logarithm (ln(x))");
                System.out.println("4. Power function (x^b)");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter number: ");
                        double sqrtInput = scanner.nextDouble();
                        try {
                            System.out.println("Result: " + sqrt(sqrtInput));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.print("Enter a non-negative integer: ");
                        int factInput = scanner.nextInt();
                        try {
                            System.out.println("Result: " + factorial(factInput));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.print("Enter number: ");
                        double lnInput = scanner.nextDouble();
                        try {
                            System.out.println("Result: " + ln(lnInput));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exponent = scanner.nextDouble();
                        System.out.println("Result: " + power(base, exponent));
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }
        }
    }

