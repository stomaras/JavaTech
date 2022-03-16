package com.example.test;

public class QAexample2 {

    public static void main(String[] args) {
        String str = " ";
        str.trim();// str is immutable not assign to any reference so garbage collection
        System.out.println(str.equals("") + "..." + str.isEmpty());
    }
}
