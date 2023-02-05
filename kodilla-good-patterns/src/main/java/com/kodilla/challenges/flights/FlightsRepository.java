package com.kodilla.challenges.flights;

import java.util.List;
import java.util.Map;

public interface FlightsRepository {

    void addFlight(Flight flight);

    Map<String, List<String>> getAllFlights();

    List<String> getAllDeparturesFromCity(String city);

    List<String> getAllArrivalsToCity(String city);

    List<String> getFlightsWithOneConnectingFlight(String city, String destination) throws FlightNotFoundException;
}
