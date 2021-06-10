package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ISaveable player = new Player("Tom", 20, 20);

        Player tom = new Player("Tom", 10, 15);
        System.out.println(tom.toString());
        saveObject(tom);

        tom.setHitPoints(9);
        System.out.println(tom);
        saveObject(tom);
        loadObject(tom);





    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a String\n" +
                "0 to quit"
                );
        while (!quit){
            System.out.println("Choose an option!");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    // we can use any object that is use ISaveable interface and has implement this interface.
    public static void saveObject(ISaveable objectToSave){
        // objectToSave.write() return the list
        for (int i = 0; i <= objectToSave.write().size(); i++){
            System.out.println(" Saving " + objectToSave.write().get(i) + " to storage device ");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        // In this case what we are doing is, we've got the data which we have typed
        // and we are going back into the player object is gonna then call the read method
        // and extract the necessary data out and basically save it as the object
        // values for each of those entries of the name the weapon etc.
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }





}
