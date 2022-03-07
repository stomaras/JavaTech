package com.example.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Receiver {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\spyros\\Maven\\SerializablePart16\\src\\com\\example\\test\\abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject();
        System.out.println(d2.i+ "..." +d2.j);
    }
}
