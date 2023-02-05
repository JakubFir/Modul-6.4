package com.kodilla.challenges.flights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import static org.mockito.Mockito.when;


class FlightServiceTest {


    @Test
    void shouldReturnAllFlightsFromWarsaw() {
        //given
        Flight warszawa = new Flight("warsaw", "poznan",1);

        FlightService flightService = Mockito.mock(FlightService.class);
        when(flightService.getAllDeparturesFromCity(warszawa.getDepartureCity())).thenReturn(Arrays.asList("poznan"));
        //when
        List<String> result = flightService.getAllDeparturesFromCity(warszawa.getDepartureCity());
        //then
        Assertions.assertEquals(warszawa.getDestinationCity(),result.get(0));


    }
    @Test
    void testGetAllArrivalsToCity() {
        Flight warsaw = new Flight("warsaw","poznan",1);
        Flight poznan = new Flight("poznan", "wroclaw",2);
        Flight gdansk = new Flight("gdansk","poznan",3);
        FlightService flightService = new FlightService();
        flightService.addFlight(warsaw);
        flightService.addFlight(poznan);
        flightService.addFlight(gdansk);

        // when
        List<Flight> arrivalsToCity = flightService.getAllArrivalsToCity(poznan.getDepartureCity());

        // then
        List<Flight> expected = new ArrayList<>();
        expected.add(warsaw);
        expected.add(gdansk);
        Assertions.assertEquals(expected, arrivalsToCity);
    }

    @Test
    void testFlightWithOneConnectingFlight() throws FlightNotFoundException {
        Flight warsaw = new Flight("warsaw", "poznan",1);
        Flight poznan = new Flight("poznan","france",2);
        Flight gdansk = new Flight("gdansk",  "poznan",3);
        FlightService flightService = new FlightService();
        flightService.addFlight(warsaw);
        flightService.addFlight(poznan);
        flightService.addFlight(gdansk);
        //when
        List<String> result = flightService.getFlightsWithOneConnectingFlight("warsaw","france");
        //then
        List<String> expected = Arrays.asList("warsaw-poznan-france");
        Assertions.assertEquals(expected,result);
    }

}