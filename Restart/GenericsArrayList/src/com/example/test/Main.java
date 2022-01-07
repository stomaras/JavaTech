package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Tom");
        studentList.add("Chris");
        studentList.add("Kostas");
        studentList.add("George");

        // typical for loop:
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        System.out.println("--------------");

        // for each loop:
        for (String s : studentList) {
            System.out.println(s);
        }

        System.out.println("--------------");

        // JDK 8 - streams with lambda:
        studentList.stream().forEach(ele -> System.out.println(ele));

        System.out.println("--------------");

        //iterator:
        Iterator<String> it = studentList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }




        // list with other collection:
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java", "C#", "Python", "JS"));
        System.out.println(names);
    }
}
