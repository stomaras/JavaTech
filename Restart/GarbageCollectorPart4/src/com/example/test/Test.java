package com.example.test;

public class Test {
    public static void main(String[] args) {
        //String s = new String("Tom");
        Test test = new Test();
        test = null;// test object eligible for GC so we call Test class finalize() method
        System.gc();
        System.out.println("End of main");
    }
    public void  finalize(){
        System.out.println("finalize method");
    }
}
