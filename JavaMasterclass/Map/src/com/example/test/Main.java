package com.example.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Map Interface is part of the collections framework
        // even though it's not a true collection.
        // Map is not part of the collection exactly like it says a list
        // of Queue and Deque. Now the map interface replaces the dictionaries
        // abstract class and like the class that replaces it maps keys to values,
        // so a language dictionary is a classic example of a map with the keys being the words
        // in the dictionaries and the values being of course the definition of the words now
        // unfortunately the analogy falls a bit with the English language and the reason for that
        // is many English words have the same meanings, so the word put for example has four different points
        // two as a verb two as a noun.
        // Now a java map cannot contain duplicate keys and each key can only map to a single value. So in the next
        // few lectures we gonna have a look at the two classes that implement the map interface and they are
        // Hash Map as well as Linked Hash Map in as well as going into Tree Map that implements the sorted map interface
        // Now maps like all the core collection interfaces are generic they take two types one for the key and one for the value
        // Know it is possible to use raw maps.
        // So i am going to start with an example using hash map to store descriptions of a few computer languages
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        // By Default ArrayList Constructor constructs an empty list with AN INITIAL
        // capacity of ten.
        List<Theatre.Seat> reserveSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reserveSeats);
        printList(reserveSeats);


        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("=========================================================================================");
        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("=====================================================");
    }
}
