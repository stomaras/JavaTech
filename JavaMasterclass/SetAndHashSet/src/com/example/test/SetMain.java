package com.example.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i=1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes ");

        // Union
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        // Intersection
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");// space as a delimiter, so we get each word that's in a string and as a seperate entry in our string array.
        words.addAll(Arrays.asList(arrayWords));
        // asList() method of collections are attended as a bridge between the two API's so the (Arrays.)asList methods on the screen provides a convenient way to initialize a
        // collection with a list of values as there is still not set of literals in Java
        // set one takes set 2 is not the same as set 2 takes set 1 now a diagram is always useful.

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] arrayNatureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "three"};
        nature.addAll(Arrays.asList(arrayNatureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));
        System.out.println(nature);
        System.out.println(divine);



    }
}
