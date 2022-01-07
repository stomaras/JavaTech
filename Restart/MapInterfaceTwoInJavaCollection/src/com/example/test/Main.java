package com.example.test;

import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // Hashtable is also a class which implements map so if i go to hash table
        // even hash table implements map
        // Now the difference between hash map and hash table is one is synchronized the other one is not
        /*
            {@code Hashtable} is synchronized
            {@code HashMap} is not synchronized
            So when you know that you have we don't want to achieve thread safety of course it should go for hash map
            but if you want thread safety go with hash table
         */

        Map<String, String> map = new Hashtable<>();

    }
}
