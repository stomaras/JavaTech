package com.example.test;

import java.io.File;

public class CreateNewFile {

    public static void main(String[] args) {

        // create a file object for the current location
        File file = new File("C:\\Users\\spyros\\JavaTech\\Restart\\JavaIOStreams\\File\\newFile.txt");

        try {

            // trying to create a file based on the object
            boolean value = file.createNewFile();
            if (value == true) {
                System.out.println("The new file is created.");
            } else {
                System.out.println("The file already exists.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
