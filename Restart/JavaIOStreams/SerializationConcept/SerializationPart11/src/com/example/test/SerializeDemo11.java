package com.example.test;

import java.io.*;

class Animal
{
    int i = 10;
    Animal(){
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal implements Serializable
{
    int j = 20;
    Dog()
    {
        System.out.println("Dog constructor called");
    }
}
public class SerializeDemo11 {
    public static void main(String[] args) throws Exception{
        Dog d1 = new Dog();
        d1.i = 888;
        d1.j = 999;

        FileOutputStream fos = new FileOutputStream("C:\\Users\\spyros\\Maven\\SerializationPart11\\src\\com\\example\\test\\abcd.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        System.out.println("Deserialization started");
        FileInputStream fis = new FileInputStream("C:\\Users\\spyros\\Maven\\SerializationPart11\\src\\com\\example\\test\\abcd.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject();
        System.out.println(d2.i + "..." + d2.j);
    }
}
