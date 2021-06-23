package com.example.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();


    public static void main(String[] args) {
	// write your code here
        // List is an ordered collection of items that can contain duplicates
        // a set has no defined ordering number one and the order or the Oracle
        // documentation define it as chaotic but secondly a set cannot contain duplicates
        // so very important distinctions there in actual fact the lack of duplicates is the
        // most important differentiator as there are ordered sets such as the link
        // hash set and tree set
        // If you want to ensure that there is no duplicate in your new collection
        // hen a good way of doing that is to use a set rather than a list.
        // Now the set interface just like everything else in the collections framework is generic
        // and it takes single type just like maps and lists
        // Now the set interface defines the basic method add remove and clear to maintain
        // the items in the set as well as offering a size method and is empty to provide
        // some information about how much or how many items are actually in the set
        // whether it is empty or not
        // You can check if something exists and you can iterate over all the elements
        // in the set but attempting to get say for example the 10th element from a set
        // is not possible you need to use a list for that and we have already
        // used a set when looking at maps the keys in the map can be retrieved as set using
        // the key set method we talked about before. Using immutable objects as elements in a set
        // to can cause problems and the behaviors is undefined if changing an objects affects
        // equal comparisons just as a map cannot contain itself as a key a set
        // can't be an element of itself although once again it will be a bizzare program
        // if it needed to actually do that now the best-performing implementation
        // of a set interface is the hashset class and that uses hashes to store the items now this
        // A set it can be implemented using a map and it's not hard to work out that you
        // can actually use the corresponding map object and use only the keys ignoring
        // the values so this is what hash set does and whenever an element is added to the set
        // it becomes a key in the undrlying hashmap and a dummy objct is stord as the value
        // so sets can be useful because operations on them are very fast and if you are
        // dealing with the mathematical notion of a set then the java collection set
        // types really allow the ususal set operation such as union and intersection which is pretty
        // cool so
        // Practice Time :
        // We are gonna create a program to model the bodies in the solar system and to save
        // time we won't try and create every object even without considering
        // asteroids and comets are nearly two hundred in our solar systems so we'll just
        // use a very small set no pun intnded there objcts in the solar system can be
        // grouped into various ways just planets moons
        // asteroids comts e/t/c

        // Planet Mercury
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // Planet Venus
        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // Planet Earth
        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon",27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Earth

        // Planet Mars
        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // We've added the two moons of mars there
        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        // Jupiter Planet
        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // We've added the two moons of Jupiter here
        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is till Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        // Planet Saturn
        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // Planet Uranus
        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // Planet Nepture
        temp = new HeavenlyBody("Nepture", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // Planet Pluto
        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody jupiterMoon : body.getSatellites()){
            System.out.println("\t" + jupiterMoon.getName());
        }

        // Now we get all the moons from all planets
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        // Print out all moons from all planets
        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        // We add another one Heavenly Body with orbital period 842
        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);

        // The equals method has to be overriden our heavenly body class
        for (HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }

        Object o = new Object();
        o.equals(o);
        "pluto".equals("");

    }
}
