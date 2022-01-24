package com.example.test;

import java.util.*;

public class Main {
    public static Map<HeavenlyBody.Key , HeavenlyBody> solarSystem = new HashMap<>();
    public static Set<HeavenlyBody> planets = new HashSet<>();


    public static void main(String[] args) {
	// write your code here

        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSattelites(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 13);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSattelites(tempMoon);

        tempMoon = new Moon("Phobos", 03);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSattelites(tempMoon);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 18);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSattelites(tempMoon);

        tempMoon = new Moon("Europa", 35);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSattelites(tempMoon);

        tempMoon = new Moon("Ganymede", 71);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSattelites(tempMoon);

        tempMoon = new Moon("Callisto", 167);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSattelites(tempMoon);

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets : ");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets){
            moons.addAll(planet.getSattelites());
        }

        System.out.println("Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getKey());
        }

        HeavenlyBody pluto = new DwarfPlanet("Pluto", 843);
        planets.add(pluto);

        System.out.println("Every planet orbital period: ");
        for (HeavenlyBody planet : planets){
            System.out.println(planet);
            //System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for (HeavenlyBody jupiterMoon : body.getSattelites()) {
            System.out.println("\t" + jupiterMoon.getKey());
        }

        HeavenlyBody earth1 = new Planet("Earth",365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));

        System.out.println();
        System.out.println("The solar system contains: ");
        for (HeavenlyBody heavenlyBody : solarSystem.values()) {
            System.out.println(heavenlyBody);
        }
    }
}
