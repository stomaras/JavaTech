package com.example.test;

import java.io.FileWriter;

public class WriteFile {

    public static void main(String[] args) {

        String data = "\n Hey dude xristos kanas is back";

        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("C:\\Users\\spyros\\JavaTech\\Restart\\JavaIOStreams\\File\\input.txt");

            // Writes string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
