package com.example.test;

import javax.naming.NamingEnumeration;

class MyThread extends Thread {
    public void run(){
        for (int i=0; i < 10000; i++){
            System.out.println("I am lazy thread" + i);
        }
        System.out.println("I want to sleep");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("I got interrupted");
        }
    }
}


public class ThreadInterruptDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
        System.out.println("End of main");
    }
}
