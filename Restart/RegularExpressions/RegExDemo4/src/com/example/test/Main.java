package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pattern p = Pattern.compile("a?");
        Matcher m = p.matcher("abaabaaab");
        while (m.find()){
            System.out.println(m.start() + "..." + m.group());
        }
    }
}
