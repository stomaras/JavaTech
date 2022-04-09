package com.example.test;

public class ChildThread extends Thread{
    public void run(){
        System.out.println("Child value: " + ParentThread.tl.get());
    }
}
