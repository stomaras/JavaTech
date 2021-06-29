package com.example.test;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }

    }

    private static int divide() {
        int x, y;
  //      try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + " y is " + y);
            return x / y;
//        } catch (NoSuchElementException e) {
//            throw new ArithmeticException("no suitable input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("attempt to divide by zero");
//        }
    }

    // getInt() method can get an exception when theirs no more input available
    // or when the input does not represent a valid integer. Now we could catch the exception but if we did that
    // will we do with it . Generally speaking there is no point catching an exception unlless your code can do
    // something sensible with it as a result
    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while (true) {
            try {
                return s.nextInt();
            }catch (InputMismatchException e){
                // go round again. Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9");
            }
        }
    }



}

// When throw an exception java automatically prints a stack trace which is showing the call stack
// so the call stack is a list of all the methods
// Every time a new method is called it's actually placed onto the stack and when a method returns
// its then removed from the stack
// Best way to approach these traces is generally to start at the boom and then work back up so our
// first code which is on line 8 is the first item relates to our Code
