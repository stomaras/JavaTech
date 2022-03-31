package com.example.test;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Tom");
        MyThread t2 = new MyThread(d, "spyros");
        t1.start();
        t2.start();
    }
}
