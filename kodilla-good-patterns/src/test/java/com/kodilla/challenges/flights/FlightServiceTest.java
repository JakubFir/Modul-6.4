package com.kodilla.challenges.flights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;




class FlightServiceTest {
    FlightService flightService;
    @BeforeEach
    void setUp() {
        Flight warsaw = new Flight("warsaw", "poznan",1);
        Flight poznan = new Flight("poznan","france",2);
        Flight gdansk = new Flight("gdansk",  "poznan",3);
        flightService = new FlightService();
        flightService.addFlight(warsaw);
        flightService.addFlight(poznan);
        flightService.addFlight(gdansk);
    }

    @Test
    void shouldReturnAllFlightsFromWarsaw() {
        //given

        //when
        List<String> result = flightService.getAllDeparturesFromCity("warsaw");
        //then
        Assertions.assertEquals("poznan",result.get(0));


    }
    @Test
    void testGetAllArrivalsToCity() {
        Flight warsaw = new Flight("warsaw","poznan",1);
        Flight gdansk = new Flight("gdansk","poznan",3);
        // when
        List<Flight> arrivalsToCity = flightService.getAllArrivalsToCity("poznan");
        // then
        List<Flight> expected = new ArrayList<>();
        expected.add(warsaw);
        expected.add(gdansk);
        Assertions.assertEquals(expected, arrivalsToCity);
    }

    @Test
    void testFlightWithOneConnectingFlight() throws FlightNotFoundException {

        //when
        List<String> result = flightService.getFlightsWithOneConnectingFlight("warsaw","france");
        //then
        List<String> expected = Arrays.asList("warsaw-poznan-france");
        Assertions.assertEquals(expected,result);
    }

}