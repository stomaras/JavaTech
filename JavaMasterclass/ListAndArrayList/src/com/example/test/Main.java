package com.example.test;

import java.util.Scanner;
// ArrayList inherits from the list which actually inherits from an abstract list
// ArrayList handles the resizing automatically
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    // Choice 0. Print Instructions
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    // Choice 1. Print groceryList
    public static void printGroceryList(){
        groceryList.printGroceryList();
    }

    // Choice 2. addItem() in the List
    public static void addItem(){
        System.out.println("Add an item to the list: ");
        String item = scanner.nextLine();
        System.out.println("Item added to the list");
        groceryList.addGroceryItem(item);
    }

    // Choice 3. modify an item
    public static void modifyItem(){
        System.out.println("Position of new item: ");
        int newPosition = scanner.nextInt();
        System.out.println("Enter New Item: ");
        String newItem = scanner.nextLine();

        scanner.nextLine();
        groceryList.modifyGroceryItem(newPosition-1, newItem);
    }

    // Choice 4. Remove an Item
    public static void removeItem(){
        System.out.println("Enter the position of the item in order to remove: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(position-1);
    }

    // Choice 5. Search an item in the list
    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }







}
