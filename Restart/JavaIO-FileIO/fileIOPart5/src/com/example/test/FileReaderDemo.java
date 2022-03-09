package com.example.test;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\spyros\\Maven\\fileIOPart5\\src\\com\\example\\test\\abc.txt");
        int i = fr.read();
        while (i != -1){
            System.out.print((char) i);
            i = fr.read();
        }
        fr.close();
    }
}
