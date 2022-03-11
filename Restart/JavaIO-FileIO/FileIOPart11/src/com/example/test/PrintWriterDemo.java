package com.example.test;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("C:\\Users\\spyros\\Maven\\FileIOPart11\\src\\com\\example\\test\\abc.txt");
        pw.write(100);
        pw.println(100);
        pw.println(true);
        pw.println('c');
        pw.println("durga");
        pw.flush();
        pw.close();

    }
}
