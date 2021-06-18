package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // What I will do is use a simple seatbooking system in theater to see how
        // these classes that we've used earlier fit into the Java Collections Framework.
        // So theater seats will be numbered with a row letter, and then a seat number within
        // each row.

        // Now the collections class provides a binary search method that performs
        // much better. So that as a result we can improve the reserve seat method and its
        // performance. Now in order to get that to work we need to implement the comparable
        // interface in our seats class, and that's so that Java knows how to compare two seats;
        //

        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);
        // There is also a shuffle method in the collections class and that shuffles the elements of the list in
        // a random or sort of a pseudo-random order.  That's a good way of pseudo randomization.
        // shuffle method is part of the collections framework.

        Theatre.Seat minSeat = Collections.min(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

//        theatre.getSeats();
//        if (theatre.reserveSeat("D12")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if (theatre.reserveSeat("D12")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==================================================================================================================================================================================================================================================================================================================================================================================================");

    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i=0; i<list.size() -1; i++){
            for (int j=i+1; j<list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}


// Collction Framework it defines several classes and interfaces which we can use to represent a group
// of individual objects as a single entity
