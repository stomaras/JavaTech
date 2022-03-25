package com.example.test;

public class MyThread extends Thread{

}

class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        MyThread t = new MyThread();
        System.out.println(t.getPriority());// Inherit priority of Parent Thread which is main Thread
    }
}
