package com.example.test;

import java.util.ArrayList;

public class GenericsArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> marksList = new ArrayList<Integer>();

        marksList.add(100);
        marksList.add(32);

        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(32.32);
        doubleList.add(34.43);

        ArrayList<String> studentNames = new ArrayList<String>();
        studentNames.add("Tomy");

    }


}
