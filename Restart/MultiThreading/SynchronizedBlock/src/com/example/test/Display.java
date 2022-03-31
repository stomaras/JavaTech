package com.example.test;

public class Display {
    public void wish(String name){

        // only one thread at a time
        synchronized (Display.class){
            for (int i=0; i<10; i++){
                System.out.println("Good Morning");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e){

                }
                System.out.println(name);
            }
        }

    }
}
