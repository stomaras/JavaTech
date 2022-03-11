package com.example.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergerFiles {

    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter("C:\\Users\\spyros\\Maven\\FileIOPart15Repeat\\src\\com\\example\\test\\xyz\\output.txt");
        File f = new File("C:\\Users\\spyros\\Maven\\FileIOPart15Repeat\\src\\com\\example\\test\\xyz");
        String[] s = f.list();

        for (String s1 : s){

            BufferedReader br = new BufferedReader(new FileReader(new File(f,s1)));
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
