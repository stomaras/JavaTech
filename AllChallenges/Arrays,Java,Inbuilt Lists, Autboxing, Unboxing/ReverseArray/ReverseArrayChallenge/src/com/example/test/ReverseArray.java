package com.example.test;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        reverse(array, 5);

    }

    static void reverse(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }

        // printing the reversed array
        System.out.print("Reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.print(a[k]);
        }
    }



}
