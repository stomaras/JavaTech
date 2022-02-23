package com.example.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
	// write your code here
        FileInputStream fis = new FileInputStream("C:\\Users\\spyros\\Maven\\FileInputStreamClassObject\\src\\com\\example\\test\\abc.txt");
        int data;

        // fis.read() , will read only one byte from the file
        while ((data = fis.read()) != -1){
            System.out.print((char) data);

        }


        fis.close();




    }
}
