package com.example.test;

import java.util.Scanner;

public class case7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your City Name: ");
        String name = sc.nextLine().toLowerCase().trim();
        if (name.equals("hyderabad")){
            System.out.println("Hello Hyderabadi, Aaadab...");
        } else if (name.equals("chennai")){
            System.out.println("Hello Madrasi, Vanakkam...");
        } else if (name.equals("bangalore")){
            System.out.println("Hello Kannadiga, Namaskara...");
        } else {
            System.out.println("Please enter valid city name");
        }
    }
}
