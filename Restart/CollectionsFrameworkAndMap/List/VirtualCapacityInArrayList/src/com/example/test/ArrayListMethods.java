package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf(num -> num%2 == 0);
        System.out.println(numbers);

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Navven", "Tom", "Peter", "Jonas", "Tom", "Lisa"));
        System.out.println(namesList);

        namesList.retainAll(Collections.singleton("Tom"));
        System.out.println(namesList);

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        ArrayList<Integer> subList = new ArrayList<>(numbers1.subList(2, 6));
        System.out.println(subList);

        // --------------------------------------------------------------------------------------------
        ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Peter", "Steve", "Lisa", "Robert"));
        Object arr[] = newList.toArray();
        System.out.println(Arrays.toString(arr));

        for (Object o : arr) {
            System.out.println(o);
        }
    }

}
