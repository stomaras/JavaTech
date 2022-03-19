package com.example.test;

import java.util.ArrayList;

public class Main {
 
    public static void main(String[] args) {
	// write your code here
        ArrayList l = new ArrayList();
        l.add("A");
        l.add(10);
        l.add('b');
        l.add(null);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(2, "m");
    }
}
