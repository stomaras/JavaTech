package com.example.test;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception  {
	// write your code here
        int count = 0;
        File f = new File("C:\\dire");
        String[] s = f.list();
        for (String s1 : s){
            count++;
            System.out.println(s1);
        }
        System.out.println("The total number :" + count);
    }
}
