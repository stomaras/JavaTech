package com.example.test;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        int count = 0;
        File f = new File("C:\\dire");
        for (String s1 : f.list()){
            File f1 = new File(f, s1);
            if (f1.isDirectory()){
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("The total Number is: " + count);
    }
}
