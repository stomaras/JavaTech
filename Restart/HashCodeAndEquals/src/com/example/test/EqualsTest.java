package com.example.test;

public class EqualsTest {

    public static void main(String[] args) {

        Human stathis = new Human(122, null);
        Human duplicateStathis = new Human(122, "Stathis");
        boolean result = stathis.equals(duplicateStathis);
        System.out.println(result);



    }
}
