package com.example.test;

import java.io.FileReader;

public class TryWithResources {

    public static void main(String[] args) throws Exception {
        try(FileReader fr = new FileReader("input.txt")) {

        }
    }
}
