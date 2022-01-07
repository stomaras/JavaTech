package com.example.test;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // All this comes under collection API now set inside also we can have elements the way we do with ArrayList
        // A difference among list and set because both are doing the same stuff. In list we can have duplicate elements
        // but when it comes to set will have all the unique elements. Set supports only unique elements cannot support
        // duplicate elements
        // .add() method in Set interfce return boolean value , true if value which we add exist and false in any other case.

        /*
            NOTE !!! HashSet<>, will not give you the sequence you put the elements and this due to hashing concept.
            NOTE !!! TreeSet<>, will give you data in a particular sequence and that is in ascending order
         */

        Set<Integer> values = new HashSet<>();

        values.add(5);
        values.add(6);
        values.add(9);

        for (int i : values)
        {
            System.out.println(i);
        }
    }
}
