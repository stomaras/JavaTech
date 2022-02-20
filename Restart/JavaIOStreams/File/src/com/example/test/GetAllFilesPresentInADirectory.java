package com.example.test;

import java.io.File;

public class GetAllFilesPresentInADirectory {

    public static void main(String[] args) {

        // creates a file object
        File file = new File("C:\\Users\\spyros\\JavaTech\\Restart\\JavaIOStreams\\directory");

        // returns an array of all files
        String[] fileList = file.list();

        for (String str: fileList){
            System.out.println(str);
        }
    }
}
