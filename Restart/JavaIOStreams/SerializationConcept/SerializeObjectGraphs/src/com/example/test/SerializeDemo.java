package com.example.test;

import java.io.*;

class Dog implements Serializable {
    Cat c = new Cat();
}

class Cat implements Serializable
{
    Rat r = new Rat();
}

class Rat implements Serializable{
    int j = 20;
}

public class SerializeDemo {

    public static void main(String[] args) throws Exception{
        Dog d1 = new Dog();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\spyros\\Maven\\SerializeObjectGraphs\\src\\com\\example\\test\\abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("C:\\Users\\spyros\\Maven\\SerializeObjectGraphs\\src\\com\\example\\test\\abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog) ois.readObject();
        System.out.println(d2.c.r.j);

    }
}
