package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        Pattern p = Pattern.compile("ab");// Create a Pattern Object with a Regular Expression, compile is a static factory method.
        Matcher m = p.matcher("ababbbbbbbbbabaaaaaabaaa");

        while (m.find()){
            count++;
            System.out.println(m.start() + "..." + m.end() + "..." + m.group());// which is the start index and which is the end index of Regular Expression
        }
        System.out.println("The number of occurences: " + count);
    }
}
