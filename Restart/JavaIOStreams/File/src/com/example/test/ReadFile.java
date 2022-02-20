package com.example.test;

import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) {

        char[] array = new char[200];
        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader("C:\\Users\\spyros\\JavaTech\\Restart\\JavaIOStreams\\File\\input.txt");

            // Reads characters
            input.read(array);
            System.out.println("Data in the fiel: ");
            System.out.println(array);

            // Closes the reader
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
