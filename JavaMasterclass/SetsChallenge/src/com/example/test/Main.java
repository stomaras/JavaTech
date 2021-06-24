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
        // HeavenlyBody class also has a " bodyType " field. This field will store
        // the type of HeavenlyBody ( PLANET, DWARF_PLANET, MOON).
        //
        // For each of the three types that is supported, subclass the HeavenlyBody class
        // so that your program can create objects of the appropriate type.
        //
        // There is a restriction that the only satellites that planets can have must be moons
        //
        // Implement the following:
        // 1. HeavenlyBody (abstract class)
        // - it has three private final fields.A key called key, a double called orbitalPeriod
        //   and a Set of type HeavenlyBody called satellites.
        // - A constructor that takes a String(name of the HeavenlyBody), a double(its orbital period)
        //   and a BodyType.key is initialised with a new Key object and satellites is initialised with a new HashSet.
        //   - Eight methods:
        //      - getOrbitalPeriod(), getter for orbitalPeriod.
        //      - getKey(), getter for key.
        //      - addSatellite(), it takes a HeavenlyBody as a parameter and returns true
        //        if it was added successfully, false otherwise.
        //      - getSatellites(), return a new HashSet populated with satellites.
        //      - equals(), override method declared as public final. Two HeavenlyBody
        //        objects are equal if their key s are equal.
        //      - hashCode(), override method declared as public final.Return the hash code of key
        //      - makeKey(), declared as public static and returns a new Key object.
        //      - toString(), override method. Return the string representation as:
        //        name: bodyType, orbitalPeriod.
        //      - A nested enum named BodyTypes declared as public.
        //      - And a nested class declared as public static final named key.
        //
        // 2. BodyTypes(nested enum)
        // - It has three constants: PLANET, DWARF_PLANET and MOON
        //
        // 3. Key (nested class)
        // - It has two fields.A String called name and a BodyTypes called bodyType.
        // - A constructor declared as private that takes a String and a BodyTypes and
        //   initialises the fields with it.
        // - And five methods:
        //      - getName(), getter for name
        //      - getBodyType(), getter for bodyType.
        //      - equals(), override method. Two Key objects are equal if they have the same
        //        name and bodyType.
        //      - hashCode(), override method.Return the hash code for name, plus the hash code
        //        for bodyType, plus an arbitary number (random)
        //      - toString(), override method. Return the string representation as: name: bodyType.
        //
        // 4. Planet
        // - A constructor that takes a String(name of the planet) and a double (its orbital period)
        // and calls its parent class with its arguments.
        // - And one method
        //      - addSatellite(), override method.Add the satellite method if its body
        //        type is a moon.
        //
        // 5. DwarfPlanet
        // - A constructor  that takes a String (name of the dwarf planet) and a double
        //   (its orbital period) and calls its parent class with its arguments.
        // 6. Moon
        // - A constructor that takes a String(name of the moon) and a double(its orbital period)
        // and calls its parent class with its arguments.
        //----------------------------------------------------------------------------//
        //----------------------------------------------------------------------------//
        //----------------------------------------------------------------------------//
        /*
            Modify the previous Heavenly Body example so that the HeavenlyBody class also
            has a "bodyType" field. This field will store the type of HeavenlyBody (such as
            STAR, PLANET, MOON, etc).

            You can include as many types as you want, but must support at least PLANET
            and MOON.

            For each of the types that you support, subclass the HeavenlyBody class
            so that your program can create objects of the appropriate type.

            Although astronomers may shudder at this, our solar systems will allow two bodies
            to have the same name as long as they are not the same type of body: so you could
            have a star called "BetaMinor" and an asteroid also called "BetaMinor", for example.

            Hint: This is much easier to implement for the Set than it is for the Map,
            because the Map will need a key that uses both fields.

            There is a restriction that the only satellites that planets can have must
            be moons. Even if you don't implement a STAR type, though, your program
            should not prevent one being added in the future (and a STAR's satellites
            can be almost every kind of HeavenlyBody).

            Test cases:
            1. The planets and moons that we added in the previous video should appear
               in the solarSystemcollection and in the sets of moons for the appropriate
               planets.

            2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

            3. Attempting to add a duplicate to a Set must result in no change
               to the set (so the original value is not replaced by the new one).

            4. Attempting to add a duplicate to a Map results in the original being
               replaced by the new object.

            5. Two bodies with the same name but different designations can be added
               to the same set.

            6. Two bodies with the same name but different designations can be added
               to the same map, and can be retrieved from the map.
         */
        HeavenlyBody temp = new Planet(88,"Mercury");
        solarSystem.put(temp.getNameOfPlanet(), temp);
        planets.add(temp);

        temp = new Planet(255, "Venus");
        solarSystem.put(temp.getNameOfPlanet(), temp);
        planets.add(temp);

        temp = new Planet(255, "Earth");
        solarSystem.put(temp.getNameOfPlanet(), temp);
        planets.add(temp);

        // Moon here
        HeavenlyBody tempMoon = new Moon(27, "Moon");
        solarSystem.put(tempMoon.getNameOfPlanet(), tempMoon);
        temp.addSatellite(tempMoon);


        temp = new Planet(255, "Mars");
        solarSystem.put(temp.getNameOfPlanet(), temp);
        planets.add(temp);

        // tempMoon 1
        tempMoon = new Moon(1.3, "Deimos");
        solarSystem.put(tempMoon.getNameOfPlanet(), tempMoon);
        temp.addSatellite(tempMoon);

        // tempMoon 2
        tempMoon = new Moon(0.3, "Phobos");
        solarSystem.put(tempMoon.getNameOfPlanet(), tempMoon);
        temp.addSatellite(tempMoon);

        // Jupiter planet
        temp = new Planet(4332,"Jupiter");
        solarSystem.put(temp.getNameOfPlanet(), temp);
        planets.add(temp);

        // tempMoon for planet Jupiter 1
        tempMoon = new Moon(1.8, "Io");
        solarSystem.put(tempMoon.getNameOfPlanet(), tempMoon);
        temp.addSatellite(tempMoon);

        // tempMoon for planet Jupiter 2
        tempMoon = new Moon(3.5, "Europa");
        solarSystem.put(tempMoon.getNameOfPlanet(), tempMoon);
        temp.addSatellite(tempMoon);

        // tempMoon for planet Jupiter 3
        tempMoon = new Moon(7.1, "Ganymede");
        solarSystem.put(tempMoon.getNameOfPlanet(), tempMoon);
        temp.addSatellite(tempMoon);

        // Saturn planet
        temp = new Planet(10759,"Saturn");
        solarSystem.put(temp.getNameOfPlanet(), temp);
        planets.add(temp);

        // Uranus Planet
        temp = new Planet(30660, "Uranus");
        solarSystem.put(temp.getNameOfPlanet(), temp);
        planets.add(temp);

        // Nepture Planet
        temp = new Planet(165, "Nepture");
        solarSystem.put(temp.getNameOfPlanet(), temp);
        planets.add(temp);

        // Pluto Planet
        temp = new Planet(248, "Pluto");
        solarSystem.put(temp.getNameOfPlanet(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getNameOfPlanet());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getNameOfPlanet());
        for (HeavenlyBody jupiterMoon : body.getSatellites()){
            System.out.println("\t" + jupiterMoon.getNameOfPlanet());
        }

        HeavenlyBody earth = solarSystem.get("Earth");
        System.out.println("Moons of " + earth.getNameOfPlanet());
        for (HeavenlyBody earthMoon : earth.getSatellites()){
            System.out.println("\t" + earthMoon.getNameOfPlanet());
        }

        HeavenlyBody jupiter = solarSystem.get("Jupiter");
        System.out.println("Moons of " + jupiter.getNameOfPlanet());
        for (HeavenlyBody jupiterMoon : jupiter.getSatellites()){
            System.out.println("\t" + jupiterMoon.getNameOfPlanet());
        }

        // Now we get all the moons from all planets
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        // Print out all moons from all planets
        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getNameOfPlanet());
        }

        // We add another one Heavenly Body with orbital period 842
        HeavenlyBody pluto = new Planet(842, "Pluto");
        planets.add(pluto);

        // The equals method has to be overriden our heavenly body class
        for (HeavenlyBody planet : planets) {
            System.out.println(planet);
//            System.out.println(planet.getNameOfPlanet() + ": " + planet.getOrbitalPeriod());
        }

        HeavenlyBody earth1 = new Planet(365,"Earth");
        HeavenlyBody earth2 = new Planet(365, "Earth");
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));




    }
}
