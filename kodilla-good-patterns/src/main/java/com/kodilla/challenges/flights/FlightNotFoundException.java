package com.kodilla.challenges.flights;

import java.util.List;



public class FlightNotFoundException extends Exception {
    FlightNotFoundException(){
        System.out.println("flight not found");
    }
}
