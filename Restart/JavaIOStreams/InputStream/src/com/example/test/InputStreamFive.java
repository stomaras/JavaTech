package com.example.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamFive {
    /*
    java.io.InputStream.read() method reads the next byte of the data
    from the input stream
    and returns int in the range of 0 to 255. If no byte is available because
    the end of the stream has been reached, the returned value is -1.
     */
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        int i;
        char c;

        try {
            // new input stream is created
            is = new FileInputStream("C:\\IOTXTS\\test.txt");

            System.out.println("Characters printed: ");

            // read till the end of the stream
            while ((i = is.read()) != -1){

                // converts integer to character
                c = (char) i;

                // prints character
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (is != null) {
                is.close();
            }
        }
    }
}
