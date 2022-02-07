package com.example.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException {

    public static void main(String[] args){
        int i=8,j,k=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println(k);
        try {
            System.out.println("Enter a number");
            j = Integer.parseInt(br.readLine());
            k = i + j;
            if (k < 10){
                throw new ArithmeticException();
            }
            System.out.println("Output is : " + k);

        }catch (IOException e){
            System.out.println("IOException" + e);
        } catch (ArithmeticException e) {
            System.out.println("Minimum Value for the output is 10");
        }catch (Exception e) {
            System.out.println("Unknown Exception");
        } finally {
            System.out.println("BYE");
        }
        System.out.println(k);
    }
}
