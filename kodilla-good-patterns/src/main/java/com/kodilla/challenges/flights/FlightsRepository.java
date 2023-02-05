package com.kodilla.challenges.flights;

import java.util.List;
import java.util.Map;

public interface FlightsRepository {

    void addFlight(Flight flight);

    Map<Long, Flight> getAllFlights();

    List<String> getAllDeparturesFromCity(String city);

    List<Flight> getAllArrivalsToCity(String city);

    List<String> getFlightsWithOneConnectingFlight(String city, String destination) throws FlightNotFoundException;
}
