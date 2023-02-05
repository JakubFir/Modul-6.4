package com.kodilla.challenges.flights;

public class FlightsApplication {
    public static void main(String[] args) throws FlightNotFoundException {
        FlightProcessor flightProcessor = new FlightProcessor(new FlightService());
        flightProcessor.processFlight();

    }
}
