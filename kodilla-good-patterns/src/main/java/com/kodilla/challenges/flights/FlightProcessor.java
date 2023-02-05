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
        Flight warsawToPoznan = new Flight("warsaw", "poznan",1);
        Flight poznanToWroclaw = new Flight("poznan","wroclaw",2);
        Flight gdanskToGermany = new Flight("gdansk", "zywiec",3);
        Flight zywiecToGermany = new Flight("zywiec",  "germany",4);
        Flight katowiceToGermany = new Flight("katowice",  "germany",5);
        Flight warsawToGdansk = new Flight("warsaw", "gdansk",6);

        flightsRepository.addFlight(warsawToPoznan);
        flightsRepository.addFlight(poznanToWroclaw);
        flightsRepository.addFlight(gdanskToGermany);
        flightsRepository.addFlight(zywiecToGermany);
        flightsRepository.addFlight(katowiceToGermany);
        flightsRepository.addFlight(warsawToGdansk);

        System.out.println(flightsRepository.getAllFlights());
        System.out.println();
        System.out.println(flightsRepository.getAllDeparturesFromCity("warsaw"));
        System.out.println();
        System.out.println(flightsRepository.getAllArrivalsToCity("germany"));
        System.out.println();
        System.out.println(flightsRepository.getFlightsWithOneConnectingFlight("gdansk","germany"));
        System.out.println();



    }
}
