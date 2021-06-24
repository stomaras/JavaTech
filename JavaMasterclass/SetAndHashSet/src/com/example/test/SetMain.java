package com.example.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
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

        System.out.println("nature-divine");
        Set<String> diff1 = new HashSet<>(nature); // we initialize with the nature set
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine-nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        // Union
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);
        // Symmetric difference is just removing the intersection from
        // the union so to do that
        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        // contains all is used to test it if one set is a super set of another
        if (nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        }

        if (nature.containsAll(intersectionTest)) {
            System.out.println("Intersection is subset of nature");
        }

        if (divine.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of divine");
        }















    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    /*
    Symmetric difference is the elements that appear in one set or the other but not both
    so it can therefore be defined as the union minus the intersection

     */

}

