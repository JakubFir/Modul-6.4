package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("asd", true);
        flightMap.put("dsa", false);
        flightMap.put("qwerty", true);

        if (flightMap.containsKey(flight.getDepartureAirport())) {
            System.out.println("flight exists");
            return true;
        } else {
            throw new RouteNotFoundException();
        }
    }
}
