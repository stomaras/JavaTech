package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayListInJava {

    public static void main(String[] args) {

        // 1. sort and then equals:

        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));

        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2));

        //2. compare two list - find out the additional elements:
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F", "G"));

        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        //3. find out the missing elements:
        l4.removeAll(l5);
        System.out.println(l4);

        // find out the common elements:
        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("JAVA", "PYTHON", "RUBY", "C#", "JS"));
        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("JAVA", "PYTHON", "RUBY", "C#", "PHP"));

        lang1.retainAll(lang2);
        System.out.println(lang1);
    }
}
