package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 16, 800));
        laptops.add(new Laptop("Apple", 8, 1200));
        laptops.add(new Laptop("Acer", 12, 700));

        // When we have a list of Integers or a list of Strings
        // we can easily sort those values with the help of Collections class
        // but in this case will not work Collections.sort(laps) not work
        // Collections.sort(listofIntegers) sort by ascending order
        // IN this case in which parameter Collection Framework can sort?
        // In order to sort Laptop you need to implement an interface called Comparable

        // Now we will be using comparator in two's situation the first is
        // what if you got a class and this class is not implementing any interface
        // If you get this class from somewhere else so maybe using some third-party library
        // and that library has this class, now of course you cannot change the source code
        // you have only a class file.

        // sort method of collection framework takes 2 parameters List first and a comparator object

        // When you have a class which is not implementing an interface example if i
        // even remove Comparable<Laptop> we don't need Comparable

        // Integer class implements Comparable , all the inbuilt classes which we use
        // implements Comparable , but they have their own logic, what if you want to have
        // your own logic then in that case you will use comparator.


        // 2 situations to use Comparator
        // 1) when your class is not implementing comparable interface
        // 2) when you want to change the logic or when you want to change the way it sorsts the value


        Comparator<Laptop> com = new Comparator<Laptop>()
        {
            public int compare(Laptop l1, Laptop l2)
            {
                if (l1.getPrice() > l2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(laptops, com);

        for (Laptop laptop : laptops)
        {
            System.out.println(laptop);
        }
    }
}
