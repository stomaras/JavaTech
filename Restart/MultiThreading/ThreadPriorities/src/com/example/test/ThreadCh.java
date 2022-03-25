package com.example.test;

public class ThreadCh extends Thread{
    public void run(){
        for (int i=0; i < 10; i++){
            System.out.println("child thread");
        }
    }
}
