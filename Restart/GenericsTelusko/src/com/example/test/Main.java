package com.example.test;

import java.util.ArrayList;
import java.util.List;

/*
    You can use O, you can use I, but T represents type
 */

class Container<T>
{
    // Working with a Container of Integers T will be Integers
    // When you work with Generics only accepts classes like Integer not int!
    // I work with generics but i want T be only type number so i do the following
    // Container<T extends Number>, so only that class can replace this T which extends number
    //
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show()
    {
        System.out.println(value.getClass().getName());
    }
    
}


public class Main {

    public static void main(String[] args) {
	// write your code here

        // We have type safety with use of Generics
        Container<Integer> obj = new Container<>();
        obj.value = 9;
        obj.show();
    }
}
