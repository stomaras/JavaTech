package com.example.test;

import java.util.*;

public class Main {

    private static final Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are in front of computer"));
        locations.put(1, new Location(1, "California love-knows how to party...In the city of L.A"));
        locations.put(2, new Location(2, "Somewhere between living and dreaming there is NEW YORK"));
        locations.put(3, new Location(3, "Colorado is an oasis, an otherworldly mountain peace"));
        locations.put(4, new Location(4, "Don't mess with texas"));
        locations.put(5, new Location(5, "I love you from here to north carolina"));

        exitsPerLocation();
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 3;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exitss = locations.get(loc).getExits();
            Set<String> exitsPerLoc = exitss.keySet();
            System.out.println("Available directions:");
            for (String exit : exitsPerLoc) {
                System.out.print(exit + ",");
            }
            System.out.println();
            System.out.print("Enter new direction: ");
            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word: words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }


            if (exitss.containsKey(direction)) {
                loc = exitss.get(direction);
            } else {
                System.out.println("=====================================");
                System.out.println("You can not go in that direction");
                System.out.println("=======================================");
            }
            System.out.println();
        }

    }

    public static void exitsPerLocation() {
        for (int i=1; i <= locations.size(); i++) {
            if (i == 1) {
                locations.get(i).addExits("N",2);
                locations.get(i).addExits("E",3);
                locations.get(i).addExits("S",4);
            } else if (i == 2) {
                locations.get(i).addExits("S",3);
            } else if (i == 3) {
                locations.get(i).addExits("N", 2);
                locations.get(i).addExits("S",4);
                locations.get(i).addExits("W",1);
                locations.get(i).addExits("E",5);
            } else if (i == 4){
                locations.get(i).addExits("N", 3);
                locations.get(i).addExits("E", 5);
            } else if (i == 5) {
                locations.get(i).addExits("W", 3);
            }
        }
    }

}
