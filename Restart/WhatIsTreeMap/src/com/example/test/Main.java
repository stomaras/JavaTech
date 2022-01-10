package com.example.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
            Integer are representing the salary of the employee and the String is representing the employee name

            TreeMap is printing in the sorted order on the basis of keys, in that case always go with treemap
         */

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1000, "Tom");
        map.put(2000, "Peter");
        map.put(3000, "Steve");
        map.put(11000, "Naveen");
        map.put(1400, "Robby");

        System.out.println(map);

        map.forEach((k,v) -> System.out.println(" key = " + k + " value = " + v));

        System.out.println("Max employee Salary: " + map.lastKey());
        System.out.println("Min employee Salary: " + map.firstKey());
        Set<Integer> keysLessThan3k = map.headMap(3000).keySet();
        System.out.println("Give all salaries where salary is < 3000 : " + keysLessThan3k);
        Set<Integer> keysLessGr3k = map.tailMap(3000).keySet();
        System.out.println("Give all salaries where salary is >= 3000 : " + keysLessGr3k);

        TreeMap<String, Integer> UserMap = new TreeMap<>();
        UserMap.put("James", 100);
        UserMap.put("Brad", 200);
        UserMap.put("Albert", 400);
        UserMap.put("George", 50);
        UserMap.put("Larry", 900);
        UserMap.put("Ted", 120);
        UserMap.put("Paul", 300);

        UserMap.forEach((k,v) -> System.out.println(" key = " + k + " value = " + v));

        // Reverse Order
        TreeMap<String, Integer> UserMapReverse = new TreeMap<>(Comparator.reverseOrder());
        UserMapReverse.put("James", 100);
        UserMapReverse.put("Brad", 200);
        UserMapReverse.put("Albert", 400);
        UserMapReverse.put("George", 50);
        UserMapReverse.put("Larry", 900);
        UserMapReverse.put("Ted", 120);
        UserMapReverse.put("Paul", 300);
        System.out.println("Reverse order : " + UserMapReverse);



    }
}
