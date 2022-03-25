package com.example.test;
class MyThreadd extends Thread {
    public void run()
    {
        for (int i=0; i<10; i++){
            System.out.println("Child Thread");
        }
    }
}
public class ThreadPrioritiesDemo {
    public static void main(String[] args) {
        MyThreadd t = new MyThreadd();
        //t.setPriority(10);
        t.start();
        for (int i = 0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
