package com.kodilla.exception.test;

public class RoutNotFoundExceptionRunner {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight asd = new Flight("asd", "asd");
        try {
            flightSearch.findFlight(asd);
        } catch (RouteNotFoundException e) {
            System.out.println("flight doesnt exists");
        }
    }

}
