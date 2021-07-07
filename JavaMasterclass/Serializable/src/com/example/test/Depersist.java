package com.example.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

    public static void main(String[] args) {
        try {
            // Creating stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student) in.readObject();
            // Printing the data of the serialized object
            System.out.println(s.id+ " " +s.name);
            // closing the stream
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
