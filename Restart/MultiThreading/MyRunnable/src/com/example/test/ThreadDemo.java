package com.example.test;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t = new MyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("Tom");// explicitly provided by programmer
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);
    }
}
