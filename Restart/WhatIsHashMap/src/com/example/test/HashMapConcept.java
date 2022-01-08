package com.example.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapConcept {


    public static void main(String[] args) {
        // no order - no indexing
        // stores values -- Key-Value <k,v>
        // key can not be duplicate
        // if you do not have the key you will get null value
        // can store n number of null values but only one null key
        // hashmap is not thread-safe - unsychronized
        // There are two types of iteration one for the keys and one for the values
        // iterator() in this case will have to apply on tghe keySet not on the capitalMap

        HashMap<String, String> capitalMap = new HashMap<String, String>();
        capitalMap.put("Greece", "Athens");
        capitalMap.put("USA", "Washigton DC");
        capitalMap.put("UK", "London");
        capitalMap.put("UK", "London11");
        capitalMap.put(null, "Berlin");
        capitalMap.put(null, "LA");
        capitalMap.put("France", null);

        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("UK"));

        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("France"));

        System.out.println("===============================");
        //iterator: over the keys:
        Iterator<String> it = capitalMap.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("key = " + key + " ,value = " + value);
        }


        System.out.println("==============================");
        // iterator: over the set (pair): by using entrySet

        Iterator<Map.Entry<String, String>> it1 = capitalMap.entrySet().iterator();

        while (it1.hasNext()) {
            Map.Entry<String, String> entry = it1.next();
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
        }

        System.out.println("===============================");
        // iterate hashmap using java 8 for each and lambda:
        capitalMap.forEach((k,v) -> System.out.println("key = " + k + " and value = " + v));




    }


}
