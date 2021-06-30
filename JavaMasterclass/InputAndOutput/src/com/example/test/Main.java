package com.example.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

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
        // Immutable classes can not be changed once they are created
        // now the techniques are valuable if you want instances on your class to be immutable
        // but also using some of the techniques in immutable classes is a
        // great way to increase encapsulation and reduce errors even if your going to
        // allow external code to modify your class instances.









        Scanner scanner = new Scanner(System.in);
        printOptions();
        play();

    }

    public static void printOptions(){
        System.out.println("Available Options: \n");
        System.out.println("1.Go West -> W\n");
        System.out.println("2.Go East -> E\n");
        System.out.println("3.Go North -> N\n");
        System.out.println("4.Go South -> S\n");
        System.out.println("5.Exit -> Q");
    }

    public static void play(){
        Scanner scanner = new Scanner(System.in);
        int loc = 1;

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        System.out.println(locations.get(loc).getExits());
        while (true) {
            System.out.println(locations.get(loc).getDescription() + "\n");
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit: exits.keySet()) {
                System.out.print(exit + ", ");

            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split("");
                for (String word : words){
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);

            } else {
                System.out.println("You cannot go in That direction");
            }

        }

    }
}

