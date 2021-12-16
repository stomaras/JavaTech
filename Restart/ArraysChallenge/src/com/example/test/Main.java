package com.example.test;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of enter Integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.
        int NewArray[] = getIntegers();
        System.out.println("Our new Array : \n");
        printArray(NewArray);
        sortedArray(NewArray);
        System.out.println("Our new sorted array in descending order : \n");
        printArray(NewArray);

    }

    public static int[] getIntegers(){
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Enter the length of the array: ");
        length = scanner.nextInt();
        int Array[] = new int[length];
        for (int i = 0; i < Array.length; i++){
            System.out.println("Enter an integer number: ");
            Array[i] = scanner.nextInt();
        }
        return Array;
    }

    public static void printArray(int[] Array){
        for (int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);
        }
    }

    public static int[] sortedArray(int[] Array){
        int temp = 0;

        for (int i = 0; i < Array.length; i++){
            for (int j = i + 1; j < Array.length; j++){
                if (Array[i] < Array[j]){
                    temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        return Array;
    }
}
