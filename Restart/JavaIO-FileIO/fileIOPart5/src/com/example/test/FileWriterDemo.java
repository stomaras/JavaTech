package com.example.test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\spyros\\Maven\\fileIOPart5\\src\\com\\example\\test\\abc.txt", true);
        fw.write(100);
        fw.write('\n');
        fw.write("durga\nsOFTWARE\n");
        char[] ch = {'a','b','c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();
    }
}
