package com.example.test;

public class IllegalArgumentException {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setPriority(100);
    }
}
