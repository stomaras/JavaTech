package com.example.test;

public class Test {
    static int count = 0;
    public static void main(String[] args) {
        for (int i=0; i<1000000; i++){
            Test t = new Test();
            t = null;
        }
    }
    public void finalize(){
        System.out.println("finalize method called: " + ++count);
    }
}
