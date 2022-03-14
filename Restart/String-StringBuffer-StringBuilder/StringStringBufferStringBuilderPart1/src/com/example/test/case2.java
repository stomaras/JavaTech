package com.example.test;

public class case2 {

    public static void main(String[] args) {
        String s1 = new String("durga");
        String s2 = new String("durga");

        System.out.println(s2 == s1);
        System.out.println(s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("durga");
        StringBuffer sb2 = new StringBuffer("durga");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
    }
}
