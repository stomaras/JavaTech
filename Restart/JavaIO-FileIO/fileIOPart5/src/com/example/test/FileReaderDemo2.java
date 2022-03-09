package com.example.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\spyros\\Maven\\fileIOPart5\\src\\com\\example\\test\\abc.txt");
        FileReader fr = new FileReader(f);
        char[] ch = new char[(int) f.length()];// type casting is must, in other case we will have compile time error
        fr.read(ch);
        for (char ch1 : ch)
        {
            System.out.print(ch1);
        }

    }
}
