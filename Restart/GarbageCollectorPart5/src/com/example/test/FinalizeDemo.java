package com.example.test;

public class FinalizeDemo {

    static FinalizeDemo s;
    public static void main(String[] args) throws InterruptedException{
        FinalizeDemo f = new FinalizeDemo();
        System.out.println(f.hashCode());
        f = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());// clear indication that Object does not destroyed
        s = null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("End of Main Method");
    }

    public void finalize(){
        System.out.println("finalize method called");
        s = this;
    }
}
