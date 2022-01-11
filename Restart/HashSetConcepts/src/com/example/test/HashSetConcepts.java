package com.example.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<String>();

        hs.add("Alpha");
        hs.add("Beta");
        hs.add("testing");

        System.out.println(hs);

        System.out.println(hs.contains("testing"));

        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /*
            Mathematical Operations : Union, Intersection, Difference
         */

        Set<Integer> first = new HashSet<Integer>();
        first.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,9,10}));

        Set<Integer> second = new HashSet<Integer>();
        second.addAll(Arrays.asList(new Integer[] {1,3,5,6,0,9}));

        // get the union
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        System.out.println(union);
        System.out.println("-----------------------------------");

        // get the intersection: common items
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        System.out.println(intersection);
        System.out.println("------------------------------------");
        // get the differences:
        Set<Integer> diff = new HashSet<>(first);
        diff.removeAll(second);
        System.out.println(diff);



    }
}
