package com.example.test;

import java.util.ArrayList;
import java.util.Iterator;

public class IllegalStateException {
    public static void main(String[] args) {

        Thread t = new Thread();
        t.start();
        t.start();
    }
}
