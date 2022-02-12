package com.example.test;

public class ThrowsKeywordMultipleMethods {

    public static void main(String[] args) throws InterruptedException {
        doStuff();
    }
    public static void doStuff() throws InterruptedException {
        doMoreStuff();
    }

    public static void doMoreStuff() throws InterruptedException {
        Thread.sleep(1000);
    }
}
