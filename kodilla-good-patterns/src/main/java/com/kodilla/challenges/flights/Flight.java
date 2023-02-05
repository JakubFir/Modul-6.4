package com.kodilla.challenges.flights;

import java.util.List;
import java.util.Objects;

public class Flight {
    private String departureCity;
    private String destinationCity;

    private long flightId;
    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public long getFlightId() {
        return flightId;
    }

    public Flight(String departureCity, String destinationCity, long flightId) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return  departureCity +"->"+ destinationCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightId == flight.flightId && Objects.equals(departureCity, flight.departureCity) && Objects.equals(destinationCity, flight.destinationCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, destinationCity, flightId);
    }


}
