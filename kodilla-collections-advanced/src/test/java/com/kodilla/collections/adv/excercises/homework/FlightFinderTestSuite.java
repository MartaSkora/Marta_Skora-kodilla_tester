package com.kodilla.collections.adv.excercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        // given
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> flightsFromCracow = finder.findFlightsFrom("Kraków");
        //then
        assertEquals(2, flightsFromCracow.size());
    }

    @Test
    public void testFindFlightsTo() {
        // given
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> flightsToAlicante = finder.findFlightsTo("Alicante");
        //then
        assertEquals(1, flightsToAlicante.size());
    }
}