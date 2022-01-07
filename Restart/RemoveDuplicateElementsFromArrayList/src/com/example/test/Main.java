package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /*
        Remove Duplicate elements from an ArrayList

        2 ways of doing it use : 1) LinkedHashSet , 2) Java Streams API's

        1) LinkedHashSet:

        comes from Set family and we know that the property of the set means property of this family
        is that it cannot have duplicate elements.

        2) JDK 8 - stream

        create a stream from this particular list


     */


    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,2,3,8,9,6,9));

        //1. LinkedHashSet

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);

        ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(linkedHashSet);

        System.out.println(numbersListWithoutDuplicate);

        //2. JDK 8 - stream:

        ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,2,1,5,6,7,6,8,8,9,10,10));
        List<Integer> marksListUnique =  marksList.stream().distinct().collect(Collectors.toList());
        System.out.println(marksListUnique);

    }
}
