package com.example.test;

public class NumberFormatException {

    public static void main(String[] args) {
        int i = Integer.parseInt("4"); // legal argument
        int j = Integer.parseInt("ten"); // illegal argument
    }
}
