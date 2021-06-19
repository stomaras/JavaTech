package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Now the Collections framework includes classes that sort their elements
        // If we implemented the comparable interface, so that we could experiment with
        // the collections.sort and reverse methods.
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
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=====================================================");
    }
}



