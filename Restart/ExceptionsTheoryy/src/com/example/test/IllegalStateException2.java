package com.example.test;

import java.util.ArrayList;
import java.util.Iterator;

public class IllegalStateException2 {

    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();

        l.add("A");
        l.add("B");
        l.add("C");
        System.out.println(l);
        Iterator itr = l.iterator();
        while (itr.hasNext()){
            Object obj = itr.next();
            itr.remove();
        }
        System.out.println(l);
    }
}
