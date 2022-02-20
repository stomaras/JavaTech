package com.example.test;

import java.io.File;

public class GetAllFilesAndSubDirectories {

    public static void main(String[] args) {
        try{
            File folder = new File("C:\\Users\\spyros\\JavaTech\\Restart\\JavaIOStreams\\Programming");

            // list all the files
            File[] files = folder.listFiles();
            for (File file : files){
                if (file.isFile()){
                    System.out.println(file);
                } else if (file.isDirectory()){
                    System.out.println(file.getAbsolutePath());
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }


}
