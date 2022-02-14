package com.example.test;

public class ExceptionInInitializerError2 {

    static {
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {

    }
}
