package com.example;

import java.util.Scanner;

public class Main {
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
                            System.out.println("Result: " + Calculator.sqrt(sqrtInput));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.print("Enter a non-negative integer: ");
                        int factInput = scanner.nextInt();
                        try {
                            System.out.println("Result: " + Calculator.factorial(factInput));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.print("Enter number: ");
                        double lnInput = scanner.nextDouble();
                        try {
                            System.out.println("Result: " + Calculator.ln(lnInput));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exponent = scanner.nextDouble();
                        System.out.println("Result: " + Calculator.power(base, exponent));
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