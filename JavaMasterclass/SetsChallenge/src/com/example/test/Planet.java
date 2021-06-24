package com.example.test;

import java.util.Set;

public class Planet extends HeavenlyBody{

    public Planet(double orbitalPeriod, String name) {
        super(orbitalPeriod, name, BodyTypes.PLANET);
    }

    // We want to override the add satellite and you will see why we gonna do that
    // shortly


    // In terms of satellites a moon is valid for a planet
    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        }else {
            return false;
        }
    }
}
