package com.example.test;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

        // creates a file object
        File file = new File("C:\\Users\\spyros\\JavaTech\\Restart\\JavaIOStreams\\File\\file.txt");

        // deletes the file
        boolean value = file.delete();
        if (value){
            System.out.println("The File is deleted.");
        } else {
            System.out.println("The File is not deleted.");
        }
    }
}
