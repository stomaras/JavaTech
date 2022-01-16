package com.example.test;

/**
 * Immutable objects : Once the Object is created, it can not be changed.
 *                     Properties of the Student must be final and remove all setters
 */
public class App {

    public static void main(String[] args) {

        Address homeaddress = new Address("California", "Los Angeles", "USA");
        System.out.println("address object 1 : " + homeaddress.hashCode());

        Student tom = new Student(1,"Spyros Tomaras",  homeaddress);

        System.out.println(tom);

        Address address = tom.getAddress();
        System.out.println("address object 2 :" + address.hashCode());

        address.setCity("New York");
        address.setState("New York");

        System.out.println(tom);
    }
}
