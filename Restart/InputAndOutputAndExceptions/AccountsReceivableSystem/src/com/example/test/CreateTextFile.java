package com.example.test;

import com.example.test.com.deitel.jhtp6.ch14.AccountRecord;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

    private Formatter output;  // object used to output text to file

    // enable user to open file
    public void openFile() {
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException securityException) {
            System.err.println("You don't have write access to this file.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException){
            System.err.println("Error creating file. ");
            System.exit(1);
        }
    }

    // add records to file.
    public void addRecords(){
        // object to be written to file
        AccountRecord record = new AccountRecord();
        Scanner input = new Scanner(System.in);

        System.out.printf("%s\n%s\n%s\n%s\n\n",
                "To terminate input, type te end-of-file indicator",
                "When you are prompted to enter input.",
                "On UNIX/Linux/Mac OS X type <ctrl> d the press enter",
                "On Windows type <ctrl> z then press Enter");

        System.out.printf("%s\n%s",
                "Enter account number (>0), first name, last name and balance.", "?");

        while (input.hasNext()){
            try {
                // retrieve data to be output
                record.setAccount(input.nextInt()); // read account number
                record.setFirstName(input.next()); // read first name
                record.setLastName(input.next()); // record last name
                record.setBalance(input.nextDouble()); // read balance

                if (record.getAccount() > 0) {
                    // write new record
                    output.format("%d %s %s %.2f\n", record.getAccount(), record.getFirstName(), record.getBalance());
                } else {
                    System.out.println("Account number must be greater than 0");
                }
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file.");
                return;
            } catch (NoSuchElementException elementException){
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input to user can try again
                return;
            }

            System.out.printf("%s %s\n%s", "Enter account number (>0),", "first name, last name and balance.", "?");
        }
    }

    // close file
    public void closeFile(){
        if (output != null){
            output.close();
        }
    }
}
