package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Tom");
        studentList.add("Chris");
        studentList.add("Lisa");

        // typical for loop:
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
        System.out.println("------------");
        // for each loop:
        for (String s : studentList) {
            System.out.println(s);
        }

        System.out.println("--------------");
        // JDK 8 - streams with Lambda:
        studentList.stream().forEach(ele -> System.out.println(ele));

        System.out.println("---------------");
        // iterator:
        Iterator<String> it = studentList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // list with other collection:
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
        System.out.println(numbers);


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby"));
        System.out.println(names);








    }
}
