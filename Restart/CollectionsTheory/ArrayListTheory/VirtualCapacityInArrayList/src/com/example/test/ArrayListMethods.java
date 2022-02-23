package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("java");
        ar1.add("python");
        ar1.add("ruby");
        ar1.add("javascript");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Testing");
        ar2.add("Dev Ops");

        ArrayList<String> ar3 = new ArrayList<String>();
        ar3.add("java");
        ar3.add("python");
        ar3.add("ruby");
        ar3.add("javascript");

        // addAll() method
        ar1.addAll(ar2);
        System.out.println(ar1);

        // addAll(index, array)
        ar1.addAll(2, ar2);
        System.out.println(ar1);

        // clear method
        ar1.clear();
        System.out.println(ar1);

        // clone method
        ArrayList<String> cloneList = (ArrayList<String>) ar3.clone();
        System.out.println(cloneList);

        // contains method
        boolean bool = ar3.contains("python");
        System.out.println(bool);

        // indexOf() method
        System.out.println(ar3.indexOf("python") > 0);

        // lastIndexOf()
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Naveen", "Tom", "Naveen", "Steve", "Lisa", "Naveen"));
        System.out.println(list1);

        int i = list1.lastIndexOf("Naveen");
        System.out.println(i);

        // remove(index i) method
        list1.remove(1);
        System.out.println(list1);
    }

}
