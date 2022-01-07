package com.example.test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Virtual Capacity of an ArrayList is 10 by default
        // Actual Size of ArrayList is equal with 0
        // You can change the default virtual capacity by adding a number in parentheses
        ArrayList<Object> ar = new ArrayList<Object>();

        // ar.size() always work upon the physical capacity
        // Virtual Capacity will not take any space because this is virtual space and virtual space
        // does not have any bytes or bits
        // as soon as physical capacity increasing then virtual capacity decreasing

        System.out.println(ar.size());// PC = Physical Capacity = 0

        ar.add(100);

        System.out.println(ar.size());// PC = Physical Capacity = 1
    }
}
