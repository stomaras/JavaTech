package com.example.test;

public class MaskTest {

    public static String mask(String creditCard){
        String x = "xxxx-xxxx-xxxx-";
        return x + creditCard.substring(15,19); 
    }

    public static void main(String[] args) {
        System.out.println(mask("1234-5678-9101-5979"));
    }
}
