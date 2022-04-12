package com.example.test;

public class MyRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_RED + "Hello From Runnable Class");
    }
}
