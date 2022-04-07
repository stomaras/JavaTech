package com.example.test;

public class ReentrantLockDemo4 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("First Thread");
        MyThread2 t2 = new MyThread2("Second Thread");
        t1.start();
        t2.start();
    }
}
