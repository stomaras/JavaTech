package com.example.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamFour {

    public static void main(String[] args) throws IOException {

        InputStream is = null;
        byte[] buffer = new byte[19];
        char c;

        try {
            // new input stream created
            is = new FileInputStream("C:\\IOTXTS\\test4.txt");

            System.out.println("Characters printed: ");

            is.read(buffer);
            // read stream data into buffer
            for (byte b : buffer) {

                // convert byte to character
                c = (char) b;

                // prints character
                System.out.print(c);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (is != null){
                is.close();
            }
        }
    }
}
