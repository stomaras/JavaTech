package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup g1 = new ThreadGroup("First Group");
        System.out.println(g1.getParent().getName());

        ThreadGroup g2 = new ThreadGroup(g1, "Second Group");
        System.out.println(g2.getParent().getName());

    }
}
