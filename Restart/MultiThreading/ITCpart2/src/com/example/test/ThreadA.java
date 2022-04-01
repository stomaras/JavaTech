package com.example.test;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException{
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b)
        {
            System.out.println("Main thread calling wait method");
            b.wait(10000);
            System.out.println("Main Thread got notification call");
            System.out.println(b.total);
        }
    }
}

class ThreadB extends Thread
{
    int total = 0;
    public void run()
    {
        synchronized (this){
            System.out.println("Child Thread starts calculation");
            for (int i=1; i<=100; i++){
                total+=i;
            }
            System.out.println("Child Thread giving notification");
            this.notify();// must be inside synchronized area
        }

    }
}
