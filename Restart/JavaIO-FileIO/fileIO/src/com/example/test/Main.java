package com.example.test;
import java.awt.datatransfer.FlavorEvent;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        File f = new File("C:\\Users\\spyros\\Maven\\fileIO\\src\\com\\example\\test\\abc.txt");
        System.out.println(f.exists());
        f.createNewFile(); // create file
        System.out.println(f.exists());

        File f1 = new File("C:\\Users\\spyros\\Maven\\fileIO\\src\\com\\example\\test\\ab.txt");
        System.out.println(f1.exists());
        f1.mkdir(); // create directory
        System.out.println(f1.exists());
    }
}
