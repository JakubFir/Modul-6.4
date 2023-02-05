package com.kodilla.challenges.flights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;


import static org.mockito.Mockito.when;


class FlightServiceTest {


    @Test
    void shouldReturnAllFlightsFromWarsaw() {
        //given
        Flight warszawa = new Flight("warsaw", Arrays.asList("zywiec", "poznan"));
        FlightService flightService = Mockito.mock(FlightService.class);
        when(flightService.getAllDeparturesFromCity(warszawa.getDepartureCity())).thenReturn(warszawa.getDestinationCity());
        //when
        List<String> result = flightService.getAllDeparturesFromCity(warszawa.getDepartureCity());

        //then
        Assertions.assertTrue(warszawa.getDestinationCity().equals(result));


    }
    @Test
    void testGetAllArrivalsToCity() {
        Flight warsaw = new Flight("warsaw", Arrays.asList("wroclaw", "poznan"));
        Flight poznan = new Flight("poznan", Arrays.asList("france", "wroclaw"));
        Flight gdansk = new Flight("gdansk", Arrays.asList("zywiec", "poznan"));
        FlightService flightService = new FlightService();
        flightService.addFlight(warsaw);
        flightService.addFlight(poznan);
        flightService.addFlight(gdansk);

        // when
        List<String> arrivalsToCity = flightService.getAllArrivalsToCity(poznan.getDepartureCity());

        // then
        List<String> expected = Arrays.asList("gdansk", "warsaw");
        Assertions.assertEquals(expected, arrivalsToCity);
    }

    @Test
    void testFlightWithOneConnectingFlight() throws FlightNotFoundException {
        Flight warsaw = new Flight("warsaw", Arrays.asList("wroclaw", "poznan"));
        Flight poznan = new Flight("poznan", Arrays.asList("france", "wroclaw"));
        Flight gdansk = new Flight("gdansk", Arrays.asList("zywiec", "poznan"));
        FlightService flightService = new FlightService();
        flightService.addFlight(warsaw);
        flightService.addFlight(poznan);
        flightService.addFlight(gdansk);
        //when
        List<String> result = flightService.getFlightsWithOneConnectingFlight(warsaw.getDepartureCity(),"france");
        //then
        List<String> expected = Arrays.asList("warsaw-poznan-france");
        Assertions.assertEquals(expected,result);
    }

}