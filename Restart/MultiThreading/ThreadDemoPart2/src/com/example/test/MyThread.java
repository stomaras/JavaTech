package com.example.test;

public class MyThread extends Thread{
    public void run(){
        System.out.println("This line executed by Thread: " + Thread.currentThread().getName());// child Thread
    }
}
class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("This line executed by Thread: " + Thread.currentThread().getName());// main Thread
    }
}

