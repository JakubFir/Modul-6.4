package com.kodilla.challenges.flights;

import java.util.List;
import java.util.Objects;

public class Flight {
    private String departureCity;
    private List<String> destinationCity;

    public String getDepartureCity() {
        return departureCity;
    }

    public List<String> getDestinationCity() {
        return destinationCity;
    }

    public Flight(String departureCity, List<String> destinationCity) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Flight flight = (Flight) obj;
        return departureCity.equals(flight.departureCity) &&
                destinationCity.equals(flight.destinationCity);
    }
}
