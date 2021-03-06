package com.example.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "You are sitting in front of a computer learning java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of the hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        // Room 1 -> Road
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("Q", 0);

        // Room 2 -> Hill
        locations.get(2).addExit("N", 5);
        locations.get(2).addExit("Q", 0);

        // Room 3 -> Building
        locations.get(3).addExit("W",1);
        locations.get(3).addExit("Q",0);

        // Room 4 -> Valley
        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);
        locations.get(4).addExit("Q",0);

        // Room 5 -> Forest
        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);
        locations.get(5).addExit("Q",0);

        int loc = 1;
        while (true) {
            // bug here and th reason for that is we are going to extend the program
            //
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            loc = scanner.nextInt();
            if (!locations.containsKey(loc)) {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
