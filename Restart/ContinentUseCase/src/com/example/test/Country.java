package com.example.test;

import java.util.ArrayList;

public class Country {

    private String name;
    private int countryPopulation;
    ArrayList<City> cities;

    public Country(String name, int countryPopulation) {
        this.name = name;
        this.countryPopulation = countryPopulation;
        this.cities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public ArrayList<City> getCities() {
        return cities;
    }
}
