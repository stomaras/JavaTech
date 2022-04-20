package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        \s -> Space Character
        \S -> Any Character Except Space
        \d -> Any Digit from [0-9]
        \D -> Any Character Except Digit
        \w -> Any Word Character [Any Alpha Numeric Character] [A-Za-z0-9]
        \W -> Except Word Character (special Character)
        . -> Any symbol including Special Character Also
         */
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher("a7b k@9");
        while (m.find()){
            System.out.println(m.start()+ "..." +m.group());
        }
    }
}
