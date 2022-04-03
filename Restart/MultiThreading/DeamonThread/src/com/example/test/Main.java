package com.example.test;
class MyThread extends Thread {

}
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Thread.currentThread().isDaemon());
        //Thread.currentThread().setDaemon(true);
        MyThread t = new MyThread();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}
