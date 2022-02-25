package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,43,2,5,6,7,8,9,5,4,4,5));


        //1. LinkedHashSet

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);

        ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<>(linkedHashSet);

        System.out.println(numbersListWithoutDuplicates);

        //2. JDK 8 - stream:

        ArrayList<Integer> marksList = new ArrayList<>(Arrays.asList(1,2,3,4,2,2,3,5,6,7,8,7,7,9,10));

        List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());

        System.out.println(marksListUnique);
    }
}
