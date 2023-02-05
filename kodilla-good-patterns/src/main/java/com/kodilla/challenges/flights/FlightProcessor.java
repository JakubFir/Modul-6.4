package com.kodilla.challenges.flights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightProcessor {

    private FlightsRepository flightsRepository;

    public FlightProcessor(FlightsRepository flightsRepository) {
        this.flightsRepository = flightsRepository;
    }

    public void processFlight() throws FlightNotFoundException {
        Flight warsaw = new Flight("warsaw", Arrays.asList("zywiec", "poznan"));
        Flight poznan = new Flight("poznan", Arrays.asList("france", "wroclaw"));
        Flight gdansk = new Flight("gdansk", Arrays.asList("zywiec", "germany"));
        Flight zywiec = new Flight("zywiec", Arrays.asList("katowice", "germany"));
        Flight katowice = new Flight("katowice", Arrays.asList("poznan", "germany"));

        flightsRepository.addFlight(warsaw);
        flightsRepository.addFlight(poznan);
        flightsRepository.addFlight(gdansk);
        flightsRepository.addFlight(zywiec);
        flightsRepository.addFlight(katowice);

        System.out.println(flightsRepository.getFlightsWithOneConnectingFlight(warsaw.getDepartureCity(), "france"));
        System.out.println();
        System.out.println(flightsRepository.getAllFlights());
        System.out.println();
        System.out.println(flightsRepository.getAllDeparturesFromCity(gdansk.getDepartureCity()));
        System.out.println();
        System.out.println(flightsRepository.getAllArrivalsToCity(katowice.getDepartureCity()));

    }
}
