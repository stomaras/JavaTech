package com.example.test;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        int count = 0;
        // compile is a factory method
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$.]*[.]txt");
        File f = new File("C:\\durga_classes");
        String[] s = f.list();
        for (String s1 : s){
            Matcher m = p.matcher(s1);
            if (m.find() && m.group().equals(s1)){
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("The total number of files: " + count);
    }
}
