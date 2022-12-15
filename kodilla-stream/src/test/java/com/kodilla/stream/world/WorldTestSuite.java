package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        List<Country> countriesInEurope = new ArrayList<>();
        List<Country> countriesInAsia = new ArrayList<>();
        List<Country> countriesInAfrica= new ArrayList<>();
        countriesInEurope.add(new Country("Poland",new BigDecimal("123123")));
        countriesInAsia.add(new Country("China",new BigDecimal("123123123")));
        countriesInAfrica.add(new Country("Nigeria",new BigDecimal("56666")));

        world.listOfContinents.add(new Continent("Europe",countriesInEurope));
        world.listOfContinents.add(new Continent("Asia",countriesInAsia));
        world. listOfContinents.add(new Continent("Africa",countriesInAfrica));

        //when
        BigDecimal result = world.getPeopleQuantity();

        //then
        Assertions.assertEquals(new BigDecimal("123302912"),result);
    }
}
