package com.example.test;

public class PrintStackTraceMethod {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
