package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator; // Declare Calculator object

    @BeforeEach
    public void setUp() {
        calculator = new Calculator(); // Initialize before each test
    }

    @Test
    public void testSqrt() {
        assertEquals(3.0, calculator.sqrt(9), 0.001);
        assertEquals(4.0, calculator.sqrt(16), 0.001);
    }

    @Test
    public void testSqrtNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.sqrt(-4);
        });
        assertEquals("Cannot calculate square root of a negative number.", exception.getMessage());
    }

    @Test
    public void testFactorial() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-3);
        });
        assertEquals("Cannot calculate factorial of a negative number.", exception.getMessage());
    }

    @Test
    public void testLn() {
        assertEquals(0.0, calculator.ln(1), 0.001);
        assertEquals(1.609, calculator.ln(5), 0.001);
    }

    @Test
    public void testLnZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.ln(0);
        });
        assertEquals("Natural logarithm is only defined for positive numbers.", exception.getMessage());
    }

    @Test
    public void testLnNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.ln(-2);
        });
        assertEquals("Natural logarithm is only defined for positive numbers.", exception.getMessage());
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2, 3), 0.001);
        assertEquals(1.0, calculator.power(5, 0), 0.001);
        assertEquals(0.25, calculator.power(2, -2), 0.001);
    }
}
