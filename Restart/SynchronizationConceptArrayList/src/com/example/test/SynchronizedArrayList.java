package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {

        // 1: Collections.synchronizedList
        List<String> namesList =  Collections.synchronizedList(new ArrayList<>());

        namesList.add("Java");
        namesList.add("C#");
        namesList.add("Python");
        namesList.add("JavaScript");

        //add, remove - we do not need explicit synchronization

        // to fetch/traverse the value from this list -- we have to use explicit synchronization

        synchronized (namesList) {
            Iterator<String> it = namesList.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        // 2. copyOnWriteArrayList -- its a class: Thread-Safe/Synchronized already.
        // all operations must be synchronized over here
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Tom");
        empList.add("Chris");
        empList.add("George");

        // we do not need explicit synchronization for any operation: add/remove/traverse

        Iterator<String> it = empList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }



}
