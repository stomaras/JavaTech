package com.example.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        int i;
        FileOutputStream fout = new FileOutputStream("C:\\Users\\spyros\\JavaTech\\Restart\\RealllyyyyyyBasicIO\\Notes.txt");

        String st = " Tom is really badass if situations go in edge";

        char ch[] = st.toCharArray();
        for (i = 0;  i < st.length(); i++){
            fout.write(ch[i]);
        }

        fout.close();
    }
}
