package com.example.test;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your regex:\n");
            String pat = scanner.next();
            Pattern pattern = Pattern.compile(pat);

            System.out.println("Enter an input string to search: \n");
            String inputString = scanner.next();
            Matcher matcher = pattern.matcher(inputString);

            boolean found = false;
            while (matcher.find()) {
                System.out.printf("I found the text %s ", matcher.group());
                System.out.printf("starting at %d ", matcher.start());
                System.out.printf("and ending at index %d ", matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("No match found");
            }
        }
    }
}
