package com.example.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamThree {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        byte[] buffer = new byte[20];
        char c;

        try {
            // new input stream created
            is = new FileInputStream("C:\\IOTXTS\\test.txt");

            System.out.println("Characters printed: ");

            // read stream data into buffer
            is.read(buffer, 0, 17);

            // for each byte in the buffer
            for (byte b : buffer) {

                // convert byte to character
                if (b == 0){
                    // if b is empty
                    c = '-';
                } else {

                    // if b is read
                    c= (char) b;
                    System.out.print(c);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }
}
