package com.example.test;

public class RiskyCode {
    public static void main(String[] args) {
        System.out.println("stmt-1");
        try {
            System.out.println(10/0); // Risky Code
        } catch (ArithmeticException e) {
            System.out.println(10/2);
        }
        System.out.println("stmt-3");
    }
}
