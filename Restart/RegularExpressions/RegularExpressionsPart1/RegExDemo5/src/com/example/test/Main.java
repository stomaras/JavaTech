package com.example.test;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pattern p = Pattern.compile("[.]");// Pre-Defined Character Class
        String[] s = p.split("www.durgasoft.com");
        for (String s1 : s){
            System.out.println(s1);
        }
    }
}
