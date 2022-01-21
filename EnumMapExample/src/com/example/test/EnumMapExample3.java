package com.example.test;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.EnumMap;

public class EnumMapExample3 {
    /*
    Project Set Up:
    1. EnumMap(Class keyType): The constructor is used to create an empty EnumMap with the
                               specified keyType
    2. EnumMap(EnumMap m): The constructor is used to create an enum map with the same keyType as
                           the specified enum map. with initial mappings being the same sa the EnumMap
    3. EnumMap(Map m): The constructor is used to create an enum map with initialization from the specified
                       map in the parameter.
     */


    // enum
    public enum GFG {
        CODE,
        CONTRIBUTE,
        QUIZ,
        MCQ;
    }


    public static void main(String[] args) {

        // Java EnumMap
        // Creating an empty EnumMap with key
        // as enum type state
        EnumMap<GFG, String> gfgMap = new EnumMap<GFG, String>(GFG.class);

        // Putting values inside EnumMap in Java
        // Inserting Enum keys different from
        // their natural order
        gfgMap.put(GFG.CODE, "Start Coding with gfg");
        gfgMap.put(GFG.CONTRIBUTE, "Contribute for others");
        gfgMap.put(GFG.QUIZ, "Practice Quizes");
        gfgMap.put(GFG.MCQ, "Test Speed with Mcqs");

        // Printing size of EnumMap
        System.out.println("Size of EnumMap in java: " + gfgMap.size());

        // Printing Java EnumMap
        // Print EnumMap n natural order
        // of enum keys (order on which they are declared)
        System.out.println("EnumMap: " + gfgMap);

        // Retrieving value from EnumMap
        System.out.println("Key : " + GFG.CODE + ", Value: " + gfgMap.get(GFG.CODE));

        // Checking if EnumMap contains a particular key
        System.out.println("Does gfgMap has " + GFG.CONTRIBUTE + ": " + gfgMap.containsKey(GFG.CONTRIBUTE));

        // Checking if EnumMap contains a particular value
        System.out.println("Does gfgMap has :" + GFG.QUIZ + " : " + gfgMap.containsValue("Practice Quizes"));
        System.out.println("Does gfgMap has :" + GFG.QUIZ + " : " + gfgMap.containsValue(null));



    }
}
