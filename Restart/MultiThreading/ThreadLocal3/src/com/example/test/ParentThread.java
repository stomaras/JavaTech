package com.example.test;

public class ParentThread extends Thread{
    static ThreadLocal tl = new ThreadLocal();
    public void run(){
        tl.set("pp");
        System.out.println("Parent Value: " + tl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}
