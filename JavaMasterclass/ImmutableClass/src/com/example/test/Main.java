package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //------------------ Immutable  class -------------------------
        // Immutable class means that once an object is created, we cannot change
        // its content. In java, all the wrapper classes(like Integer, Boolean, Byte,
        // ,Short) and String class is immutable. We can create our own immutable classes
        // as well
        //
        // Following are the requirements:
        // - The class must be declared as final(So that child class can't be created)
        // - Data Members in the class must be declared as final (So that we can not change the value of it after object creation)
        // - A parameterized constructor should initialize all the fields performing a deep copy
        //   ( So that data members can't be modified with object reference)
        // - Deep copy of objects should be performed in the getter methods
        // - No setter (To not have the option to change the value of the instance variable)
        Map<String, String> map = new HashMap<>();
        map.put("1","first");
        map.put("2","second");
        Student s = new Student("ABC", 101, map);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());

        map.put("3","third");
        System.out.println(s.getMetadata());// Remains unchanged due o deep copy in constructor

    }
}
