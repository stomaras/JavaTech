package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private int locationId;
    private String description;

    // Use of final provides two benefits firstly it makes it
    // clear to anyone reading the code that the field should not be changed and
    // we did not forget to write a setter and also ensure that we do not inadvertently
    // change the fields if we change the code in the location class at some time in the future
    //
    private Map<String, Integer> exits;

    public Location(int locationId, String description, Map<String, Integer> exits) {
        this.locationId = locationId;
        this.description = description;
        this.exits = exits;
        // For ach location we add the ability to quit out
        this.exits.put("Q", 0);
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }
}
