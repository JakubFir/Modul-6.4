package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String nameOfContinent;
    private List<Country> countriesInContinent;

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getCountriesInContinent() {
        return countriesInContinent;
    }
    public Continent(String nameOfContinent, List<Country> countriesInContinent) {
        this.nameOfContinent = nameOfContinent;
        this.countriesInContinent = countriesInContinent;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "nameOfContinent='" + nameOfContinent + '\'' +
                ", countriesInContinent=" + countriesInContinent +
                '}';
    }
}
