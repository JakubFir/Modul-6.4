package com.kodilla.challenges.flights;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightService implements FlightsRepository {

    private Map<String, List<String>> allFlights = new HashMap<>();

    @Override
    public void addFlight(Flight flight) {
        allFlights.put(flight.getDepartureCity(), flight.getDestinationCity());
    }

    @Override
    public Map<String, List<String>> getAllFlights() {
        return allFlights;
    }

    @Override
    public List<String> getAllDeparturesFromCity(String city) {
        if (!getAllFlights().containsKey(city)) {
            System.out.println("flight not found");
        }
        return getAllFlights().get(city);
    }

    @Override
    public List<String> getAllArrivalsToCity(String city) {
        return getAllFlights().entrySet().stream()
                .filter(entry -> entry.getValue().contains(city))
                .map(Map.Entry::getKey).collect(Collectors.toList());
    }

    @Override
    public List<String> getFlightsWithOneConnectingFlight(String city, String destination) throws FlightNotFoundException {
        if (!getAllFlights().containsKey(city)) {
            throw new FlightNotFoundException();
        } else {
            List<String> departures = getAllDeparturesFromCity(city);
            return departures.stream()
                    .filter(departure -> getAllFlights().containsKey(departure))
                    .flatMap(departure -> getAllDeparturesFromCity(departure).stream()
                            .filter(arrival -> arrival.equalsIgnoreCase(destination))
                            .map(arrival -> city + "-" + departure + "-" + destination))
                    .collect(Collectors.toList());
        }
    }
}
