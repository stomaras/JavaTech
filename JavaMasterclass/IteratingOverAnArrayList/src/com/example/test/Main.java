package com.example.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> courses = Arrays.asList("Java","C#","C++","C");

        // basic for loop
        for (int i=0; i < courses.size(); i++){
            System.out.println(courses.get(i));
        }

        // Enhanced for each loop
        for (String course: courses) {
            System.out.println(course);
        }

        // basic loop with iterator
        for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
            String course = (String) iterator.next();
            System.out.println(course);
        }

        // iterator with while loop
        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()){
            String course = (String) iterator.next();
        }

        List<String> progLanguages = new ArrayList<>();
        progLanguages.add("Java");
        progLanguages.add("C");
        progLanguages.add("C++");
        progLanguages.add("Python");
        progLanguages.add("JavaScript");

        // getting listiterator

        ListIterator<String> listIterator = progLanguages.listIterator();
        System.out.println("Forward Direction Iteration:");

        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
        }

        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }

    }
}
