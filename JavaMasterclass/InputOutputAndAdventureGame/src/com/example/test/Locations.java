package com.example.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {

//        FileWriter locFile = null;
//        try {
//            locFile = new FileWriter("locations.txt");
//            for (Location location : locations.values()) {
//                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//            }
//        } finally {
//            System.out.println("in finally block");
//            if (locFile != null) {
//                System.out.println("Attempting to close locFile");
//                locFile.close();
//            }
//        }
        try(FileWriter locFile = new FileWriter("locations.txt")) {
            for (Location location : locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
            }
        }

    }

    static {
        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0,"You are sitting in front of a computer learning java", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small bridge", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2,"You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        locations.put(4, new Location(4,"You are in a valley beside a stream", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        locations.put(5, new Location(5,"You are in the forest",tempExit));



//        locations.put(0, new Location(0, "You are sitting in front of a computer learning java"));
//        locations.put(1, new Location(1,"You are standing at the end of a road before a small bridge"));
//        locations.put(2,new Location(2,"You are at the top of a hill"));
//        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
//        locations.put(4, new Location(4, "You are in a valley beside a stream"));
//        locations.put(5, new Location(5, "You are in the forest"));
//
//        locations.get(1).addExit("W",2);
//        locations.get(1).addExit("E",3);
//        locations.get(1).addExit("S",4);
//        locations.get(1).addExit("N",5);
//        locations.get(1).addExit("Q",0);
//
//        locations.get(2).addExit("N",5);
//        locations.get(2).addExit("Q",0);
//
//        locations.get(3).addExit("W",1);
//        locations.get(3).addExit("Q",0);
//
//        locations.get(4).addExit("N",1);
//        locations.get(4).addExit("W",2);
//        locations.get(4).addExit("Q",0);
//
//        locations.get(5).addExit("S",1);
//        locations.get(5).addExit("W",2);
//        locations.get(5).addExit("Q",0);
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
