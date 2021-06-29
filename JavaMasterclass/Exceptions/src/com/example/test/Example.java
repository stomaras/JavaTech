package com.example.test;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("x is " + x + " y is " + y);
        return x / y;
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        return s.nextInt();
    }
}

// When throw an exception java automatically prints a stack trace which is showing the call stack
// so the call stack is a list of all the methods
// Every time a new method is called it's actually placed onto the stack and when a method returns
// its then removed from the stack
// Best way to approach these traces is generally to start at the boom and then work back up so our
// first code which is on line 8 is the first item relates to our Code
