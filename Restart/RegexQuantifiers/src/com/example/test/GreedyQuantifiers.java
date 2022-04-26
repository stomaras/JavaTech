package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyQuantifiers {
    public static void main(String[] args) {
        displayFind("colou?r", "Is that a coloring book?");
        displayFind("M(i\\w\\w)*i", "Mississippi river");
        displayFind("M(i\\w\\w){3}i", "Mississipi river");

        displayFind("yoyos.*", "RED YOYOS - I like red yoyos!");
        displayFind(".*yoyos", "Red YOYOS - I like red yoyos!");
        displayFind("yoyos", "Red yOyos - blue Yoyos - yellow YOYOS");
        System.out.println("\n");

        displayFind("happy.*dogs", "I like happy large dogs tom vhrtis  and happy small !");
    }

    static void displayFind(String regex, String searchMe) {
        boolean foundIt = false;
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(searchMe);
        while (m.find()){
            System.out.println("::Regex:: " + regex + ", ::found:: " + m.group() + " ::in::  " + searchMe + " at index: " + m.start() + " and ends at: " + m.end());
            foundIt = true;
        }
        if (!foundIt){
            System.out.println("No matches found for " + regex + " in string " + searchMe);
        }
    }
}
