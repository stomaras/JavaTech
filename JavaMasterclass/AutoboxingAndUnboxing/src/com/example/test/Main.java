package com.example.test;

import java.util.ArrayList;

//  We actually created a wrapper
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        // String is a class
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        // Type argument cannot be of primitive type, because a primitive type is not a class.
        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        // Integer is a class
        //Integer integer = new Integer(54);

        // Autoboxing: we convert a base primitive type int to an integer
        // We get the primitive type, we are going to wrapper so in class, that's called autoboxing.
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i=0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        // Unboxing is where we are taking it from the class or from the object wrapper and
        // converting it back to a primitive type.
        for (int i=0; i<=10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        //Integer myIntValue = Integer.valueOf(56);
        // The above mentioned is what happen at compile time.
        Integer myIntValue = 56;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl<=10.0; dbl += 0.5){
            myDoubleValues.add(dbl);
        }

        for (int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }


    }
}
