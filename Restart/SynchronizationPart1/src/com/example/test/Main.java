package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Tom");
        MyThread t2 = new MyThread(d, "chris");
        MyThread t3 = new MyThread(d, "zarma");
        t1.start();
        t2.start();
        t3.start();
    }
}
