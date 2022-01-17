package com.example.test;

public class TestBank {
    public static void main(String[] args) {

        HDFCbank hd = new HDFCbank();

        hd.credit();
        hd.credit();
        hd.loan();

        Bank b = new HDFCbank();
        b.loan();
        b.credit();
        b.debit();


    }
}
