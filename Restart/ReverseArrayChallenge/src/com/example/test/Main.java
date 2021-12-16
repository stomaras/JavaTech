package com.example.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] Array = {10,20,30,40};

        reverse(Array,Array.length);

    }

    public static void reverse(int Array[], int length){
        int[] reverseArray = new int[length];
        int j = length;
        for (int i = 0; i < length; i++){
            reverseArray[j-1] = Array[i];
            j = j - 1;
        }

        // Printing the reverse array
        System.out.println("Reversed Array is : \n");
        for (int k = 0; k < length; k++){
            System.out.println(reverseArray[k]);
        }

    }
}
