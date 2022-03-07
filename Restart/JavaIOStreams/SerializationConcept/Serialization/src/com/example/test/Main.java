package com.example.test;

import java.io.*;

public class Main {
    static class Dog implements Serializable
    {
        int i = 10;
        int j = 20;
    }

    public static void main(String[] args) throws Exception{
	// write your code here
        Dog dog1 = new Dog();

        FileOutputStream fos = new FileOutputStream("C:\\Users\\spyros\\Maven\\Serialization\\src\\com\\example\\test\\abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog1);

        FileInputStream fis = new FileInputStream("C:\\Users\\spyros\\Maven\\Serialization\\src\\com\\example\\test\\abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject();

        System.out.println(d2.i + " "+d2.i);
    }
}
