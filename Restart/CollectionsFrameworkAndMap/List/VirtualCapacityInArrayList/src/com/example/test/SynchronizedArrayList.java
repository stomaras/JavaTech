package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {

        // 1st way Collections.synchronizedList(new ArrayList<String>())
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Ruby");

        // add, remove - we dont need explicit synchronization

        // fetch value from this list -- we have to use explicit  synchronization

        synchronized (namesList){
            Iterator<String> it = namesList.iterator();

            while (it.hasNext()){
                System.out.println(it.next());
            }
        }

        // 2nd copyOnWriteArrayList -- its a class: Thread-safe/synchronized already.
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();
        empList.add("Tom");
        empList.add("Steve");
        empList.add("Naveen");


    }
}
