package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    public List<Continent> listOfContinents = new ArrayList<>();

    public BigDecimal getPeopleQuantity(){
        return listOfContinents.stream().flatMap(continent -> continent.getCountriesInContinent().stream()
                .map(Country::getPeopleQuantity)).reduce(BigDecimal.ZERO, (sum , current) -> sum = sum.add(current));
    }
}
