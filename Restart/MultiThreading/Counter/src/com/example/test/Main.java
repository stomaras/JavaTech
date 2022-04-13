package com.example.test;

public class Main {

    public static void main(String[] args) {

        /*
        We use the same Object for 2 different threads
        When we use the local variable for i that was okay because when the JVM
        allocated the space for the local variable, it used each thread's stack
        Consequently, each thread had their own copy of i on their respective thread stacks
        However when we switched to using an instance variable, the JVM allocated the space
        for i when it created the countdown object and did it in that point on the heap
        so in this case the two threads don't then have their own copy of the variable i.
        They in fact share the variable that's on the heap.
        These two threads keep interfering with each other
        Object Instance's are stored in the Heap which is shared across threads in an application

         */
        Countdown countdown = new Countdown();


        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();



    }
}

class Countdown {

    private int i;

    public void doCountdown(){
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }

        /*
        Local Variables are stored in Thread Stack
        Each Thread will create its own copy of the local variables
        and each copy is an Object that has its own lock.
         */
        synchronized (this){
            for (i=10; i>0; i--){
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
        }




    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run(){
        threadCountdown.doCountdown();
    }
}
