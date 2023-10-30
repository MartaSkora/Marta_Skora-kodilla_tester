package com.kodilla.collections.adv.excercises.homework;

import java.util.*;

public class FlightFinder {
    static Map<String, List<Flight>> flights = FlightRepository.getFlightsTable();
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Map.Entry<String, List<Flight>> airport : flights.entrySet()) {
            System.out.println(airport);
            for (Flight f : airport.getValue()) {
                System.out.println(f);
                if (f.getDeparture().equals(departure))
                    result.add(f);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Map.Entry<String, List<Flight>> airport : flights.entrySet()) {
            for (Flight f : airport.getValue()) {
                if (f.getArrival().equals(arrival))
                    result.add(f);
            }
        }
        return result;
    }
}
