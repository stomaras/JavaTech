package com.example.test;
class MyThread extends Thread
{
    public void run()
    {
        for (int i=0; i<10; i++){
            System.out.println("MyThread...");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }
    }
}
public class Demo {
    public static void main(String[] args) throws InterruptedException{
        MyThread t = new MyThread();
        t.start();
        t.join(10000);// t.join(1000)
        for (int i=0; i<10; i++){
            System.out.println("Rama Thread");
        }

    }
}
