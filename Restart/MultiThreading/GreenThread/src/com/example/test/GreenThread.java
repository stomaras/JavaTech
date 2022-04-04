package com.example.test;

class MyThread extends Thread
{
    public void run()
    {
        for (int i=0; i<10; i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }
    }
}



public class GreenThread{

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        System.out.println("End of main Thread");
        //t.stop(); deprecated method not recommended to use
        //t.suspend(); t.resume(); deprecated methods not recommended to use
    }

}
