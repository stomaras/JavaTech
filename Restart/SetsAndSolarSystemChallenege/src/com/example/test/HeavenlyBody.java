package com.example.test;

import java.util.HashSet;
import java.util.Set;

/**
 *  We make HeavenlyBody an Immutable Class in order to create a set with heavenly bodies
 *  because set follow same rules as keys of hashmaps
 *
 *  Heavenly Body class can not be made immutable because new information is constantly
 *  being discovered about the planets even in our solar system
 *
 *  Java warns you that if you are using your own objects as either a key in a map
 *  or as an element in a set that you should override the equals and hashcode methods
 *
 *  2 heavenly bodies are the same if they have the same name.
 *  if we are dealing with people, we may have to consider additional fields because
 *  many people of course can share the same name. So in that case, we may also have a
 *  check of their date of birth, social security number or other information that can
 *  be used to uniquely identify a person.
 */
public final  class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        System.out.println("obj.getClass is " + obj.getClass());
        System.out.println("this.getClass is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;// is the hashCode() method for the String class
    }
}
