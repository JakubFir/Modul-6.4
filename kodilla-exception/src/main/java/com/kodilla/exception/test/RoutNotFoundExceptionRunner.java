package com.kodilla.exception.test;

public class RoutNotFoundExceptionRunner {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight asdd = new Flight("sda", "asd");
        try {
            flightSearch.findFlight(asdd);
        } catch (RouteNotFoundException e) {
            System.out.println("flight doesnt exists");
        }
    }

}
