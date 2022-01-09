package com.example.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        HashMap -> ArrayList
        Company name is key, Number of Company employees are the value

         */

        HashMap<String, Integer> compMap = new HashMap<String, Integer>();
        compMap.put("Google", 100000);
        compMap.put("Walmart", 200000);
        compMap.put("Amazon", 300000);
        compMap.put("Facebook", 500000);
        compMap.put("Cisco", 15000);

        System.out.println("comp map size: " + compMap.size());
        System.out.println("============================================");

        Iterator it = compMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey() + "=" + pairs.getValue());
        }

        System.out.println("==============================================");
        System.out.println("Keys: ");
        // convert hashmap keys into ArrayList:
        List<String> compNamesList = new ArrayList<String>(compMap.keySet());
        System.out.println(compNamesList);
//        for (String t : compNamesList) {
//            System.out.println(t);
//        }

        System.out.println("==============================================");
        System.out.println("Values: ");
        // convert hashmap values into ArrayList:
        List<Integer> compEmployees = new ArrayList<>(compMap.values());
        System.out.println(compEmployees);
//        for (Integer i : compEmployees) {
//            System.out.println(i);
//        }


    }
}
