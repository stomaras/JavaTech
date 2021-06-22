package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private int locationId;
    private String description;

    private Map<String, Integer> exits;

    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
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

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
