package com.example.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
	// write your code here
        FileInputStream fis = new FileInputStream("C:\\Users\\spyros\\Maven\\FileCopyProgram\\src\\com\\example\\test\\abc.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\spyros\\Maven\\FileCopyProgram\\src\\com\\example\\test\\bbc.txt");

        int data;
        while ((data = fis.read()) != -1){
            fos.write(data);
            fos.flush();
        }

        System.out.println("File copied");



        fis.close();
        fos.close();


    }
}
