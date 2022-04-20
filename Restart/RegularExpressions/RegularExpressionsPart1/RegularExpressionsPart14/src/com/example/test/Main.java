package com.example.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter("C:\\Users\\spyros\\Maven\\RegularExpressionsPart14\\src\\com\\example\\test\\output.txt");
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\spyros\\Maven\\RegularExpressionsPart14\\src\\com\\example\\test\\input.txt"));
        String line = br.readLine();
        while (line != null){
            Matcher m = p.matcher(line);
            while (m.find()){
                pw.println(m.group());
            }
            line = br.readLine();
        }
        pw.flush();
        pw.close();
        br.close();
    }
}
