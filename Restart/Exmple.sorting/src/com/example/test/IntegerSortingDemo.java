package com.example.test;

import myutility.MyUtils;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSortingDemo {

    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(15);
        integerList.add(3);
        integerList.add(7);
        integerList.add(1);
        integerList.add(9);
        integerList.add(10);

        MyUtils.iterateList(integerList);
        System.out.println("=====================");
        Collections.sort(integerList);
        MyUtils.iterateList(integerList);


    }


}
