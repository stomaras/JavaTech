package com.example.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public final BodyTypes bodyType;

    // Note a nested enum is automatically static so it's possible to refer to the enum
    // values without creating an instance of a heavenly body object.
    public enum BodyTypes {
        PLANET,
        DWARF_PLANET,
        MOON
    }

    public HeavenlyBody(double orbitalPeriod, String name, BodyTypes bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.name = name;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public String getNameOfPlanet() {
        return name;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    // Any body can now be added as a satellite of the other of any other
    // and if we want to restrict planets to only have moons orbiting them we can override
    // the add satellite method in the planet sub class which i think is a much better
    // design.
    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if (this.name.equals(theObject.getNameOfPlanet())){
                return this.bodyType == theObject.getBodyType();
            }
        }
        return false;

    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }
}
