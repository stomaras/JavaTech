package com.example.test;

import java.util.*;
import java.util.List;

public class Theatre {
    // I will start by creating a list for the seats.
    // We can change a List to a Collection.
    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();



    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum<= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        // So that's going to give us the object for comparison purposes,
        // With binary Search 1,048,576 items can be checked in no more than
        // 20 comparisons.
        // Just to recap that a binary search relies on the list that you are searching,
        // being sorted.

        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
//        for (Seat seat : seats) {
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//
//        if (requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//
//        return requestedSeat.reserve();
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }



class Seat implements Comparable<Seat>{
    private final String seatNumber;
    private boolean reserved = false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }

    public boolean reserve() {
        if (!reserved) {
            this.reserved = true;
            System.out.println("Seat " + seatNumber + " reserved");
            return true;
        } else {
            return false;
        }
    }

    public boolean cancel() {
        if (this.reserved) {
            this.reserved = false;
            System.out.println("Reservation of seat " + seatNumber + " cancelled");
            return true;
        } else {
            return false;
        }
    }

    public String getSeatNumber() {
        return seatNumber;
    }


}
}
