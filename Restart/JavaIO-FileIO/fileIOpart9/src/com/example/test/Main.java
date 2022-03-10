package com.example.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileWriter fw = new FileWriter("C:\\Users\\spyros\\Maven\\fileIOpart9\\src\\com\\example\\test\\abc.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char[] ch = {'a','b','c','d'};
        bw.write(ch);
        bw.newLine();
        bw.write("durga");
        bw.newLine();
        bw.write("Software Solutions");
        bw.flush();
        bw.close();

    }
}
