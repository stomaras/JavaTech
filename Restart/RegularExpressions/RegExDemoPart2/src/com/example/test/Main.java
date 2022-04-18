package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pattern p = Pattern.compile("[^a-zA-z0-9]");
        Matcher m = p.matcher("abaababaaaabbbbbbaab@b9%#A@");
        while (m.find()){
            System.out.println(m.start() + "..." + m.group());
        }
    }
}
