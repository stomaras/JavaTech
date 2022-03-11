package com.example.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\spyros\\Maven\\FileIOPart14\\src\\com\\example\\test\\file2.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\spyros\\Maven\\FileIOPart14\\src\\com\\example\\test\\file3.txt"));
        PrintWriter pw = new PrintWriter("C:\\Users\\spyros\\Maven\\FileIOPart14\\src\\com\\example\\test\\file1.txt");
        String line1 = br1.readLine();
        String line2 = br2.readLine();
        while ((line1 != null) || (line2 != null)) {
            if (line1 != null){
                pw.println(line1);
                line1 = br1.readLine();
            }
            if (line2 != null){
                pw.println(line2);
                line2 = br2.readLine();
            }
        }
        pw.flush();
        br1.close();
        br2.close();
        pw.close();
    }
}
