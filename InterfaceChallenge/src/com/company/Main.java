package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Tom", 20, 20);
        System.out.println(player.toString());
        saveObject(player);

        player.setHitPoints(9);
        System.out.println(player);
        player.setWeapon("Stormbringer");
        saveObject(player);
        loadObject(player);
        System.out.println(player);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose an option: \n " +
                "1 to enter a string \n" +
                " 0 to quit");
        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    // Passing as parameter the ISaveable, using the ISaveable Interface and by doing that we can use
    // any object that is using this interface that has implement this interface.
    // objectToSave.write() return a list with 4 entries for each item: name, hitPoints, strength and weapon.
    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving "+ objectToSave.write().get(i) +" to storage device");
        }
    }

    // We get the data which we type and go back to Player/Monster class in read() method and extract the data
    // which we type.
    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
