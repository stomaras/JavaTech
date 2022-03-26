package com.example.test;
class MyThread extends Thread {
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("child thread");
            Thread.yield();
        }
    }
}
public class ThreadYieldDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i=0; i<10; i++){
            System.out.println("main thread");
        }
    }
}
