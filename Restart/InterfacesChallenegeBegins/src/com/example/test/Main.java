package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // In Main, write a method that takes an object that implements the interface s a parameter and "saves" the values.
        // We haven't covered I/O yet, so your method should just print the values to the screen.
        // Also in Main, write a method that restored the values to a saveable object.
        // Again, we are not going to use Java file I/O; instead use the readValues() method below to
        // simulate getting values from a file - this allows you to type as many values as your class requires,
        // and returns an ArrayList.
        ISaveable werewolf = new Monster("Wolf", 25, 89);
        saveObject(werewolf);
        loadObject(werewolf);



    }

    public static List<String> readValues(){
        Scanner scanner = new Scanner(System.in);
        List<String> values = new ArrayList<>();
        boolean quit = false;
        int action;
        int index = 0;
        while (!quit){
            System.out.println("==========================");
            System.out.println("Press 0 to exit \n" +
                    "Press 1 to enter a String \n");
            action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    String s = scanner.nextLine();
                    values.add(index, s);
                    index++;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable saveObject) {
        for (int i = 0; i < saveObject.write().size(); i++) {
            List<String> list = saveObject.write();
            System.out.println("Saving " + list.get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable loadObject) {
        List<String> values = readValues();
        loadObject.read(values);
    }









}
