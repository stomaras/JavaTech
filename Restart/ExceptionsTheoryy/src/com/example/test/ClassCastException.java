package com.example.test;

public class ClassCastException {
    /*
    ClassCastException is child of RuntimeException which is
    child of Exception, which is child of Throwable class
     */
    public static void main(String[] args) {
        String s = new String("Tom");
        Object o = (Object) s;
        System.out.println(o);

//        Object o1 = new Object();
//        String s1 = (String) o1;
//        System.out.println(s1);

        Object o2 = new String("Tomy");
        String s2 = (String) o2;
        System.out.println(s2);
    }
}
