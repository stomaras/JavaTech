package com.example.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        PrintWriter pw = new PrintWriter("C:\\xyz\\output.txt");

        File f= new File("C:\\xyz");

        String[] s = f.list();
        for (String s1 : s) {
            File f2 = new File(f, s1);
            BufferedReader br = new BufferedReader(new FileReader(f2));
            String line = br.readLine();
            while (line != null){
                pw.println(line);
                line = br.readLine();
            }
        }
        pw.flush();
        pw.close();
    }
}
