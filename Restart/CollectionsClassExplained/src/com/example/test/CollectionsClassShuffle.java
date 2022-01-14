package com.example.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsClassShuffle {

    public static void main(String[] args) {
        shuffleAlgorithmsDemo();
    }
    /*
    The shuffle algorithm does the opposite of what sort does, destroying any trace
    of order that may have been present in a List. That is, this algorithm reorders
    the List based on input from a source of randomness such that all possible permutations
    occur with equal likelihood, assuming a fair source of randomness. Collections
    utility class provides the shuffling methods.
    shuffle(List<?> list)
    Randomly permutes the specified list using a default source of randomness.All
    permutations occur with approximately equal likelihood.

    Example:
     */

    private static void shuffleAlgorithmsDemo() {

        List<String> list = new LinkedList<>();
        list.add("element 1");
        list.add("element 3");
        list.add("element 2");
        list.add("element 4");

        Collections.sort(list);
        for (String str : list) {
            System.out.println(" sort elements in ascending order --" + str);
        }
        System.out.println("------------------------------------------------");
        // randomly permutes the elements in a List.
        Collections.shuffle(list);
        for (String str : list) {
            System.out.println(" sort elements in ascending order --" + str);
        }
    }
}
