package com.example.test;

import java.util.HashMap;
import java.util.Map;

// Implementation of the adventure game called colossal cave which allows a player
// to move around in various locations by typing in compass directions.

// One thing about this class is that we are programming defensively
// what i mean by that is anything that doesn't need to be exposed to the
// outside isn't exposed and our fields are mark final so they  can't be
// changed once a constructor has finished creating a location instance so one useful
// We can remove a key only if it maps to cerain value
//
// For he map its string and an integer so the idea here is that the
// keys is going to be the direction, where we will start by using the initial letters
// north, south, NSEW to signify north, south, east and west and q to quit
// and the value will be the number of the location where we will get to if we got in that
// direction which wll be sort of the location ID
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }


    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    // Reason that we are doing that is that instead of just returning
    // the exits map and creating a new HahMap
    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
