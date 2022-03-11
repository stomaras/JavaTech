package com.example.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMerger {

    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter("C:\\Users\\spyros\\Maven\\FileIOPart13\\src\\com\\example\\test\\file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\spyros\\Maven\\FileIOPart13\\src\\com\\example\\test\\file1.txt"));
        String line = br.readLine();
        while (line != null){
            pw.println(line);
            line = br.readLine();
        }
        br = new BufferedReader(new FileReader("C:\\Users\\spyros\\Maven\\FileIOPart13\\src\\com\\example\\test\\file2.txt"));
        line = br.readLine();
        while (line != null){
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
    }
}
