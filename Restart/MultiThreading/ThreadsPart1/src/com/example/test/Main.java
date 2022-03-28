package com.example.test;
public class MyThread extends Thread{

    public void run(){
        for (int i=0; i < 10; i++){
            System.out.println("child thread");
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread t = new MyThread();
        t.start();
        for (int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
