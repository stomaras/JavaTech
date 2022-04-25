package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        displayFind("lime{1}", "5 limes for $1");
        displayFind("round{2}", "The wheels on the bus go round and round");
        displayFind("round{2}", "The wheels on the bus go roundd and round");
        displayFind("(round){2}", "The wheels on the bus go round and round");
        displayFind("(round){2}", "The wheels on the bus go roundround");
        displayFind("[ae]{4,7}", "Hella everybody, I'm Dan");
        displayFind("[ae]{4,7}", "eeae");
        displayFind("[ae]{4,}","oh craaeaep");


        // 20{4}, means 2 followed by 4 digits
        int i = 0;
        while (!Pattern.compile("20{4}").matcher(""+ ++i).find()){}
        System.out.println(i + " leagues under the sea.\n");

        displayFind("\\d{3}-\\d{4}", "345-7893");
        displayFind("\\d{3}-\\d{4}$","867-76584");
        displayFind("\\d{3}-\\d{4}$","867-7658");
        displayFind("^\\d{3}-\\d{4}$","867-7658");


    }

    static void displayFind(String regex, String searchMe) {
        boolean foundIt = false;
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(searchMe);
        while (m.find()){
            System.out.println("Regex: " + regex + ", found " + m.group() + " in: " + searchMe + " at index: " + m.start() + " and ends at: " + m.end());
            foundIt = true;
        }
        if (!foundIt){
            System.out.println("No matches found for " + regex + " in string " + searchMe);
        }
    }
}
