package com.example.test;

import java.util.ArrayList;

public class GroceryList {

    // Declaration of Grocery List
    private ArrayList<String> groceryList = new ArrayList<String>();

    // Add an item in Grocery List
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    // Print out the GroceryList
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    // Modify Grocery List
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified. ");
    }

    // Remove Grocery Item from the list
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(theItem);
        //Milk
        //Bread
    }

    // We are gonna search for a string in our ArrayList
    // contains method of ArrayList class return true if item found in the list
    // or false otherwise.
    public String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        // indexOf method of ArrayList returns the position of item in ArrayList
        // if item does not exist then returns -1, in other case returns position.

        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
