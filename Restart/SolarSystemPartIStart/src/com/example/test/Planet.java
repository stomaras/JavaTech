package com.example.test;

import java.util.Set;

public class Planet extends HeavenlyBody{

    public Planet(String name, int orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSattelites(HeavenlyBody moon) {
       if (moon.getKey().getBodyType() == BodyTypes.MOON){
           return super.addSattelites(moon);
       } else {
           return false;
       }
    }
}
