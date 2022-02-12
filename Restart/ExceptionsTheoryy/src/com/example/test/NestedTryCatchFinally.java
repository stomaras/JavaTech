package com.example.test;

public class NestedTryCatchFinally {

    public static void main(String[] args) {
        try {
            System.out.println("outer try");
            try {
                System.out.println("inner try");
                System.out.println(10/0);
            } catch (ArithmeticException ae){
                System.out.println("Inner catch block");
            }
            System.out.println("After inner try catch");
        } catch (Exception e) {
            System.out.println("outer catch block");
        } finally {
            System.out.println("outer finally block");
        }
    }
}
