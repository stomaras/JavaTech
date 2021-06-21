package com.example.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	// write your code here
        // Adventure Game
        // Implement the command() method in the Main class to allow players to type full words, or phrases, then move to the correct
        // location based upon their input
        // The player should be able to type commands such as "Go West", "Run South",
        // "I need to Quit this game" or just "East" and the program will move to the appropriate location if there is one
        // The console should display its current location, then it should prompt the user with :
        // "Available exits are", and its available exits. For example:
        // 1| You are standing at the end of a road before a small brick building
        // 2|
        // 3| Available exits are Q, S, E, N, W
        //
        // A move in a valid direction should print (keep in mind N,S,E and W variants - showing N below):
        // 1| You are standing at the end of a road before a small brick building
        // 2|
        // 3| Available exits are Q, S, E, N, W,
        // 4|
        // 5| You are in the forest
        // 6|
        // 7| Available exits are Q, S, W,
        // An attempt to move in an invalid direction should print a message and remain in the
        // same place. The printed message should be: "You cannot go in that direction".
        // For example:
        // 1| You are standing at the end of a road before a small brick building
        // 2|
        // 3| Available exits are Q, S, E, N, W,
        // 4|
        // 5| You cannot go in that direction
        // 6|
        // 7| You are standing at the end of a road before a small brick building
        // 8|
        // 9| Available exits are Q, S, E, N, W,
        // Output for quit(Q) command should be displayed as:
        // 1| You are standing at the end of a road before a small brick building
        // 2|
        // 3| Available exits are Q, S, E, N, W
        // 4|
        // 5| You are sitting in front of a computer learning java
        //
        //
        // Single letter commands (N,W,S,E,Q) should still be available.
        locations.put(0, new Location(0, "You are sitting in front of computer"));
        locations.put(1, new Location(1,"You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3,"You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));


        // Location 1 Road
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);

        // Location 2 Hill
        locations.get(2).addExit("N",5);

        // Location 3 Building
        locations.get(3).addExit("W",1);

        // Location 4 Valley
        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);

        // Location 5 Forest
        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);

        Scanner scanner = new Scanner(System.in);
        printOptions();

    }

    public static void printOptions(){
        System.out.println("Available Options: \n");
        System.out.println("1.Go West -> W\n");
        System.out.println("2.Go East -> E\n");
        System.out.println("3.Go North -> N\n");
        System.out.println("4.Go South -> S\n");
        System.out.println("5.Exit -> Q");
    }
}
