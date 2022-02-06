package com.example.test;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        /*
        Write a method called readInteger() that has no parameters and returns an int.
        It needs to read in an integer from the user - this represents how many elements the user needs to enter.

        Write another method called readElements() that has one parameter of type int
        The method needs to read from the console until all the elements are entered, an then return an array
        containing the elements entered.

        And finally, write a method called findMin() with one parameter of type int[]. The method
        needs to return the minimum value in the array

        The scenario is:
        1. readInteger() is called.
        2. The number returned by readInteger() is then used to call readElements().
        3. The array returned from readElements() is used to call findMin().
        4. findMin() returns the minimum number.
         */
        int nums = readInteger();
        int[] array = readElements(nums);
        int min = findMin(array);
        System.out.println("Minimum num of array is : " + min);
    }

    private static int readInteger(){
        System.out.println("Number of elements that user needs to enter: ");
        int numElements = scanner.nextInt();
        return numElements;
    }

    private static int[] readElements(int nums){
        int[] array = new int[nums];
        for (int i = 0; i < nums; i++) {
            System.out.println("Enter element: ");
            int num = scanner.nextInt();
            array[i] = num;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
