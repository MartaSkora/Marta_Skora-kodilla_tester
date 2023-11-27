package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001);
        assertEquals(7.5, calculator.add(4.5, 3.0), 0.0001);
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, calculator.subtract(4.0, 3.0), 0.0001);
        assertEquals(2.5, calculator.subtract(5.5, 3.0), 0.0001);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.0001);
        assertEquals(15.0, calculator.multiply(5.0, 3.0), 0.0001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.0001);
        assertEquals(4.0, calculator.divide(8.0, 2.0), 0.0001);
    }
}
