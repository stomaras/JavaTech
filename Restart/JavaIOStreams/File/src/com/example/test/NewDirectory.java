package com.example.test;

import java.io.File;

public class NewDirectory {

    public static void main(String[] args) {

        // Creates a file object with specified path
        File file = new File("C:\\Users\\spyros\\JavaTech\\Restart\\JavaIOStreams\\directory");

        // tries to create a new directory
        boolean value = file.mkdir();
        if (value) {
            System.out.println("The new directory is created");
        } else {
            System.out.println("The direcotry already exists.");
        }
    }
}
