package com.example.test;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
    ReentrantLock l = new ReentrantLock();
    public void wish(String name){
        l.lock();
        // This part will executed by only one Thread at a time
        for (int i=0; i<10; i++){
            System.out.print("Good morning: ");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e) {

            }
            System.out.println(name);
        }
        l.unlock();
    }
}

class MyThread extends Thread
{
    Display d;
    String name;

    MyThread(Display d, String name){
        this.d = d;
        this.name = name;
    }

    public void run()
    {
        d.wish(name);
    }
}


