package com.example.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

enum BodyTypes {
    PLANET,
    DWARF_PLANET,
    MOON
}

public class HeavenlyBody {

    private final Key key;
    private final int orbitalPeriod;
    private final Set<HeavenlyBody> sattelites;


    public HeavenlyBody(String name, int orbitalPeriod, BodyTypes bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.sattelites = new HashSet<>();
        this.key = new Key(name, bodyType);
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public Set<HeavenlyBody> getSattelites() {
        return new HashSet<>(this.sattelites);
    }

    public boolean addSattelites(HeavenlyBody heavenlyBody){
        return this.sattelites.add(heavenlyBody);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
           Key key = (Key) o;
           if (this.name.equals(key.getName())) {
               return (this.bodyType == key.getBodyType());
           }
           return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
