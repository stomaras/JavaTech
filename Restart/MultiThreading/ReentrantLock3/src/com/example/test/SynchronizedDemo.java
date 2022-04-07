package com.example.test;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Tom");
        MyThread t2 = new MyThread(d, "Kanas");
        MyThread t3 = new MyThread(d, "Bill");
        t1.start();
        t2.start();
        t3.start();
    }
}
