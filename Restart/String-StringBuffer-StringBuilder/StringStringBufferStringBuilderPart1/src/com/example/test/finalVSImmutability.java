package com.example.test;

public class finalVSImmutability {

    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("durga");
        sb.append("software");
        System.out.println(sb);
        //sb = new StringBuffer("ravi"); compile time error
    }
}
