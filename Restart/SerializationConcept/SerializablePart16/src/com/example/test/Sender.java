package com.example.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {

    public static void main(String[] args) throws Exception{
        Dog d1 = new Dog();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\spyros\\Maven\\SerializablePart16\\src\\com\\example\\test\\abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
    }

}
