package com.example.test;

import java.util.ArrayList;
import java.util.Objects;

public class City {

    private String name;
    public int population;
    private int movedTowardsCity = 0;
    private int movedAwayFromCity = 0;
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

    public boolean addPeople(People newPeople){
        for (People people : peoples){
            if (people.equals(newPeople)){
                return true;
            }
        }
        this.peoples.add(newPeople);
        movedTowardsCity++;
        population ++;
        return false;
    }

    public boolean removePeople(People removePeople) {
        for (People people : peoples){
            if (people.equals(removePeople)){
                peoples.remove(people);
                movedAwayFromCity++;
                population--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City city = (City) o;
        if (city.getName() == this.getName()){
            if (city.getPopulation() == this.getPopulation()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, movedTowardsCity, movedAwayFromCity, peoples);
    }

    @Override
    public String toString() {
       String s = "City with name: " + this.name + ", with population: " + population + "\n";
       s = s + "with people moved this year : " + movedTowardsCity + "\n";
       s = s + "with people moved away this year : " + movedAwayFromCity;
       return s;

    }

}
