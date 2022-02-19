package com.example.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTwo {

    public static void main(String[] args) throws IOException {
        InputStream is = null;
        int i = 0;
        char c;
        String fileName = "C:\\IOTXTS\\test.txt";

        try {
            // new input stream created
            is = new FileInputStream(fileName);

            // read till the end of the stream
            while ((i = is.read()) != -1) {

                // convert integer to character
                c = (char) i;

                System.out.println("Character read: " + c);
            }

        } catch (Exception e) {
            //if any I/O error occurs
            e.printStackTrace();
        } finally {
            // release system resources associated with this stream
            if (is != null){
                is.close();
            }
        }
    }
}
