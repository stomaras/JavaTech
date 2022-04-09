package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ThreadLocal tl = new ThreadLocal()
        {
            // override default initial value which is null with abc
            public Object initialValue()
            {
                return "abc";
            }
        };

        System.out.println(tl.get());
        tl.set("durga");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());
    }
}
