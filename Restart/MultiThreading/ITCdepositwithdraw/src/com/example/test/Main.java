package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Test t = new Test();

        new Thread(){
            public void run(){
                t.withdraw(15000);
            }
        }.start();

        new Thread(){
            public void run() {
                t.deposit(1000);
            }
        }.start();
    }
}
