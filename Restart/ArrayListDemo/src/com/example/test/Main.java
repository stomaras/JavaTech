package com.example.test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // default class
        // dynamic array


    /*
        ArrayList will maintain the order
        negative indexing is not allowed in java
        0 index is the lowest index
     */

        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(100);//0
        ar.add(200);//1
        ar.add("testing");//2
        ar.add("tomy gun");

        System.out.println(ar);
        System.out.println(ar.get(1));

        System.out.println("LI = " + 0);
        System.out.println("HI = " + (ar.size()-1));

    }
}
