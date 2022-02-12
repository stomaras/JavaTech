package com.example.test;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.exit(0);
        } catch (NullPointerException ae) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
