package com.example.test;

public class caseStringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abcdefghkdiejfnjes");
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer(1000);
        System.out.println(sb1.capacity());

        StringBuffer sb2 = new StringBuffer("Tom");
        System.out.println(sb2.capacity());

        StringBuffer tom = new StringBuffer("SpyrosTom");
        System.out.println(tom.charAt(5));
        tom.setCharAt(4,'f');
        System.out.println(tom);

        StringBuffer sb5 = new StringBuffer();
        sb5.append("PI value is ");
        sb5.append(3.14);
        System.out.println(sb5);
    }
}
