package com.example.test;

public class Main {

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
    }
}
