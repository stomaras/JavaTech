package com.example.test;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {


    public static void main(String[] args) {

        // LinkedList is a default class in Java
        // it can be used as List, Stack, Queue
        // it allows the null entry
        // dynamic collection
        // hence insertion and deletion can be easily implemented
        // it can contain duplicate elements
        // it is not synchronized(not thread safe)
        // in LinkedList, manipulation is fast because we do not need any shifting.

        // LinkedList constructors:

        // LinkedList();
        // LinkedList(Collection c);

        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Nafsika");
        names.add("Elsa");
        names.add("Evi");

        System.out.println(names);

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        names.add(4, "Nikol");
        System.out.println(names);

        names.add(2, "Vasia");
        System.out.println(names);

        LinkedList<String> users = new LinkedList<String>();

        users.add("Charly Jordan");
        names.addAll(users);
        System.out.println(names);

        names.clear();
        System.out.println(names);

        LinkedList<String> lang = new LinkedList<>();
        System.out.println(lang.size());

        lang.add("Java");
        lang.add("C#");
        lang.add("Python");
        lang.add("JavaScript");

        System.out.println(lang.size());
        Iterator<String> itr = lang.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("========================");
        for (String e : lang) {
            System.out.println(e);
        }

        //sort
        Collections.sort(lang);
        System.out.println(lang);





    }
}
