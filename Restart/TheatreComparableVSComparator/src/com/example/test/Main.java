package com.example.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
        Comparator interface defines a single method called compare.
        Unlike comparable the objects to be stored do not have to implement comparator.
        So we can either create a comparator object within an existing class, or we could create a new class
        that implements that comparator interface.
        We can add as many comparators as we want
     */
    public static void main(String[] args) {
        // write your code here
        Theatre theatre = new Theatre("Olympian", 8, 12);

        //theatre.getSeats();
        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $ " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=====================================================");
    }


}
