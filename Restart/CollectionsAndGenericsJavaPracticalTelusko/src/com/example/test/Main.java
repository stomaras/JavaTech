package com.example.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Collection extended by all following interfaces
        // 1) Set
        // 2) List, have extra features
        // 3) Queue
        /*
            NOTE!!!
            Collection.sort(values) -> ->

            method sort only take list, does not support
            collection so that is the problem with collection interface you cannot add
            values in between that means it does not work with indexes and that is why
            we cannot even sort the items because we don't have indexes and that is why
            we need to use list so that is why all developers tend to use List Interface
            instead of collection interface.

         */


        // So we can add elements in of any type
        List<Integer> values = new ArrayList<Integer>();
        values.add(3);
        values.add(99);
        values.add(77);
        values.add(88);
        values.add(1,9);
        Collections.sort(values);



        // 2 ways to fetch values from the Collection
        // first is with Iterator()
        // second is with enhanced forloop
        // Collection interface does not work with index numbers

        // 1st way
//        Iterator i = values.iterator();
//
//        while (i.hasNext())
//        {
//            System.out.println(i.next());
//        }


        // 2nd way
//        for (Integer i : values)
//        {
//            System.out.println(i);
//        }

        // 3rd way
        values.forEach(System.out::println); // Stream API which uses Lambda Expression



    }
}
