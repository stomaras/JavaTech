package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = new String("Durga");
        s = null;// eligible for garbage collector
        System.gc();// garbage collector deamon thread come into surface
        System.out.println("End of main");
    }

    // before destroying eligible objects garbage collector
    // calls finalize() method on this object
    // String class finalize() method will be called
    public void finalize()
    {
        System.out.println("Finalize method called");
    }
}
