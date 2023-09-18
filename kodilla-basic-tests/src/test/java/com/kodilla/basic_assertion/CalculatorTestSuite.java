package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
//    Utworzenie obiektu typu Calculator, zadeklarowanie trzech zmiennych i wywołanie metody assertEquals +
//    opakowanie w metodę testSum. Całość poprzedziliśmy adnotacją @Test, o której zaraz sobie opowiemy.

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquare () {
        Calculator calculator = new Calculator();
        double a = -3;
        double squareResult = calculator.square(a);
        assertEquals(9, squareResult, 0.01);
    }
}