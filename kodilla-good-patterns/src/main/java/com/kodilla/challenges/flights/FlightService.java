package com.kodilla.challenges.flights;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightService implements FlightsRepository {

    private Map<Long, Flight> allFlights = new HashMap<>();

    @Override
    public void addFlight(Flight flight) {
        allFlights.put(flight.getFlightId(), flight);
    }

    @Override
    public Map<Long, Flight> getAllFlights() {
        return allFlights;
    }

    @Override
    public List<String> getAllDeparturesFromCity(String city) {
        return getAllFlights().entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureCity().contains(city))
                .map(entry -> entry.getValue().getDestinationCity()).collect(Collectors.toList());
    }

    @Override
    public List<Flight> getAllArrivalsToCity(String city) {
        return getAllFlights().entrySet().stream()
                .filter(entry -> entry.getValue().getDestinationCity().contains(city))
                .map(Map.Entry::getValue).collect(Collectors.toList());
        }


    @Override
    public List<String> getFlightsWithOneConnectingFlight(String city, String destination) throws FlightNotFoundException {
        List<String> departures = getAllDeparturesFromCity(city);
        return departures.stream()
                .flatMap(departure -> getAllDeparturesFromCity(departure).stream()
                        .filter(arrival -> arrival.equals(destination))
                        .map(arrival -> city + "-" + departure + "-" + destination))
                .collect(Collectors.toList());
    }
}
