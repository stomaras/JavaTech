package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("java");
        ar1.add("python");
        ar1.add("c#");
        ar1.add("javascript");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Testings");
        ar2.add("dev ops");

        ar1.addAll(ar2);
        System.out.println(ar1);

//        ar1.clear();
//        System.out.println(ar1);

        ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
        System.out.println(cloneList);

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Tom", "Chris", "Lisa", "Steve"));
        System.out.println(list1);

        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Tom", "Peter", "Lisa", "Chris"));
        System.out.println(namesList);
        namesList.retainAll(Collections.singleton("Tom"));
        System.out.println(namesList);

        ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Peter", "Lisa"));
        Object arr[] = newList.toArray();
        System.out.println(Arrays.toString(arr));

        for (Object o : arr) {
            System.out.println((String) o);
        }
    }
}
