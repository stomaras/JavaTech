package com.example.test;

public class DwarfPlanet extends HeavenlyBody{
    public DwarfPlanet(double orbitalPeriod, String name) {
        super(orbitalPeriod, name, BodyTypes.DWARF_PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyType() == BodyTypes.DWARF_PLANET){
            return super.addSatellite(moon);
        } else {
            return false;
        }

    }
}
