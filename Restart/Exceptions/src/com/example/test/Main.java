package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,j,k=0;
        i = 8;
        j = 0;
        k = i/j;
        System.out.println(k);
        try {
            k = i/j;
        }catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero" + e);
        }
        System.out.println(k);


    }
}
