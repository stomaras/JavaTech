package com.example.test;

import java.io.*;

class Dog implements Serializable{
    transient final int i = 10;
    transient int j = 20;
}

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        Dog d1 = new Dog();

        FileOutputStream fos = new FileOutputStream("C:\\Users\\spyros\\Maven\\SerializationFinal\\src\\com\\example\\test\\abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("C:\\Users\\spyros\\Maven\\SerializationFinal\\src\\com\\example\\test\\abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog) ois.readObject();

        System.out.println(d2.i + "..." + d2.j);
    }
}
