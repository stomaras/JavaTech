package com.example.test;

public class case4 {

    public static void main(String[] args) {
        String s1 = new String("You cannot change Me");
        String s2 = new String("You cannot change Me");
        System.out.println(s1 == s2);

        String s3 = "You cannot change Me";
        System.out.println(s1==s3);

        String s4 = "You cannot change Me";
        System.out.println(s3 == s4);

        String s5 = "You cannot" + " change Me";
        System.out.println(s4 == s5);
    }
}
