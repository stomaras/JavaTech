package com.example.test;

/*
    Vector is a dynamic array in which you can increase the size of a vector
    by default the array capacity is 10. Vector increase the increases size
    by 100% if i exceed the number.
    Increases the capacity per user requirements
    Vector is a dynamic array
    Vector class is the implementation of List Interface
    Vector exist before List in Java
    Collection was introduced on 1.2
    Vector is there from 1.0

    When to use Vector and When to use ArrayList ?

    1) Vector if we exceed the limit increase the capacity by 100%
    This is not the same with ArrayList, so Vector waste lots of memory
    ArrayList will save the memory.

    2) Every method in Vector is synchronized it's a thread safe theoritically but not practically
    Arrays are not Thread Safe so more fast



 */


import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector<Integer> v = new Vector<Integer>();
        v.add(4);
        v.add(8);
        v.add(6);
        v.add(6);
        v.add(6);
        v.add(6);
        v.add(26);
        v.add(65);
        v.add(6);
        v.add(66);
        v.add(76);
        v.add(36);
        v.add(96);

        System.out.println(v.capacity());

        for (int i : v)
        {
            System.out.println(i);
        }



    }
}
