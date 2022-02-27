package com.example.test;

import java.util.ArrayList;

public class City {

    private String name;
    private int population;
    private ArrayList<People> peoples;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
        this.peoples = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public ArrayList<People> getPeoples() {
        return peoples;
    }

    public void addPeople(String firstName, String lastName, int height, String sex ,String color){
        boolean bool = this.peoples.add(new People(firstName, lastName, height, sex ,color));
        if (bool == true){
            population++;
        }
    }

    @Override
    public String toString() {
       String s = "City with name: " + this.name + ", with population: " + this.population + "\n";
       s = s + "with people moved this year : " + peoples.size();
       return s;

    }
}
