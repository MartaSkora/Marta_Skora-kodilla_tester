package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class CarConfigurationTestSuite {

    @Autowired
    private Car car;

    @Test
    public void shouldReturnSUV() {
       String result = car.getCarType();
       assertEquals("SUV", result);
    }

    @Test
    public void shouldHaveHeadlightsOn() {
        boolean result = car.hasHeadlightsTurnedOn();
        assertTrue(result);
    }

}