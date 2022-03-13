package com.example.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        PrintWriter pw = new PrintWriter("C:\\Users\\spyros\\Maven\\FileExtraction\\src\\com\\example\\test\\output.txt");
        BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\spyros\\Maven\\FileExtraction\\src\\com\\example\\test\\input.txt"));
        String line = input.readLine();

        while (line != null){
            boolean available = false;
            BufferedReader delete = new BufferedReader(new FileReader("C:\\Users\\spyros\\Maven\\FileExtraction\\src\\com\\example\\test\\delete.txt"));
            String target = delete.readLine();
            while (target != null){
                if (line.equals(target)){
                    available = true;
                    break;
                }
                target = delete.readLine();
            }
            if (available == false){
                pw.println(line);
            }
            line = input.readLine();
        }
        pw.flush();
    }
}
