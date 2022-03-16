package com.example.test;

public class caseStringBuffer3 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(1000);
        sb.append("ABC");
        System.out.println(sb.capacity());
        sb.trimToSize();// deallocate memory of StringBuffer object
        System.out.println(sb.capacity());
    }
}
