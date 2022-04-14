package com.example.test;

import java.util.Date;

public class RuntimeDemo {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());

        // 10.000 Objects eligible for GC
        for (int i=0; i<=100000000; i++){
            Date d = new Date();
            d = null;
        }
        System.out.println(r.freeMemory());
        r.gc();// Destroy all useless objects which are available in Heap Memory
        System.out.println(r.freeMemory());
    }
}
