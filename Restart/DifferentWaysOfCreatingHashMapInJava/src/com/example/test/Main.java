package com.example.test;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Immutable means that value cannot change so when a value is written there one single entry can add
    using singletonMap there from Collections class
 */

public class Main {

    public static Map<String, Integer> marksMap;

    static {

        marksMap = new HashMap<>();
        marksMap.put("A", 100);
        marksMap.put("B", 50);
        marksMap.put("C", 10);
    }

    public static void main(String[] args) {
	// write your code here

        //1. using HashMap class

        HashMap<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        //2. static way : static hashmap:
        System.out.println(Main.marksMap.get("A"));

        //3. immutableMap with only one single entry:
        Map<String, Integer> map3 = Collections.singletonMap("test", 100);
        System.out.println(map3.get("test"));
        //map3.put("abc", 200);// UnsupportedOperationException

        //4. JDK 8:
        // creating one 2D array of Strings using Stream and collecting in the form Map
        Map<String, String> map4 = Stream.of(new String[][] {
                {"Tom", "A Grade"},
                {"Naveen", "A+ Grade"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        System.out.println(map4.get("Tom"));
        map4.put("Lisa", "A++ Grade");
        System.out.println(map4.get("Lisa"));

        //using Simple Entry : mutable map:
        Map<String, String> map5 = Stream.of(
                new AbstractMap.SimpleEntry<>("Naveen", "Java"),
                new AbstractMap.SimpleEntry<>("Tom", "Python")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map5.get("Tom"));
        map5.put("Lisa","C#");
        System.out.println(map5.get("Lisa"));

        // using Simple Entry : Immutable map:

        Map<String, String> map6 = Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("Naveen", "Java"),
                new AbstractMap.SimpleImmutableEntry<>("Tom", "Python")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        //JDK 1.9:
        //empty map:
        Map<String, String> emptyMap = Map.of();
        //emptyMap.put("Tom", "Java");
        //System.out.println(emptyMap.get("Tom"));//UnsupportedOperationException

        // Singleton Map
        Map<String,String> singletonMap = Map.of("k1","v1");
        System.out.println(singletonMap.get("k1"));

        // multi-values Map: max 10 pairs can be stored:s
        Map<String, String> multiMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3");
        System.out.println(multiMap.get("k3"));

        //ofEntries method: no limitations on pairs (key-value)
        //Immutable Maps:
        Map<String, Integer> map7 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("A", 100),
                new AbstractMap.SimpleEntry<>("B", 200),
                new AbstractMap.SimpleEntry<>("C", 300)
        );

        System.out.println(map7.get("C"));

        //maps using Guava




    }
}
