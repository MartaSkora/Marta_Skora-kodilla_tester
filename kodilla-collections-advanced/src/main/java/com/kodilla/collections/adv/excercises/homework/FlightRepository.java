package com.kodilla.collections.adv.excercises.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class FlightRepository {
    static Map<String, List<Flight>> flights = new HashMap<>();

    public static Map<String, List<Flight>> getFlightsTable() {
        flights.put("Pyrzowice", Arrays.asList(new Flight("Katowice", "Shannon")));
        flights.put("Balice", Arrays.asList(new Flight("London", "Kraków"), new Flight("Kraków", "Alicante"), new Flight("Alicante", "Kraków"), new Flight("Kraków", "London")));
        flights.put("Luton", Arrays.asList(new Flight("London", "Warsaw"), new Flight("Warsaw", "London")));
        return flights;
    }
}
