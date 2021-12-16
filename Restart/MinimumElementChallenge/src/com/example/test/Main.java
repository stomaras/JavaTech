package com.example.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = readInteger();
        int array[] = readElements(num);
        int min = findMin(array);
        System.out.println("The minimum number of the array is : " + min);
    }

    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        return length;
    }

    public static int[] readElements(int k){
        Scanner scanner = new Scanner(System.in);
        int Array[] = new int[k];
        System.out.println("Enter the numbers of the array: ");
        for (int i=0; i < k; i++){
            Array[i] = scanner.nextInt();
        }
        return Array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
