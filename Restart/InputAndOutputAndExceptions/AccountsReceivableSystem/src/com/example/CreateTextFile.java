package com.example;
import com.deitel.jhtp6.ch14.AcountRecord;

import java.io.FileNotFoundException;
import java.util.*;

public class CreateTextFile {

    private Formatter output; // object used to output text to file

    // enable user to open file
    public void openFile(){
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException securityException){
            System.err.println("You don't have write access to ths file.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException){
            System.err.println("Error creating file.");
            System.exit(1);
        }
    }

    // add records to file
    public void addRecords() {

        // object to be written to file
        AcountRecord record = new AcountRecord();

        Scanner input = new Scanner(System.in);

        System.out.printf( "%s\n %s\n %s\n %s\n\n",
                "To terminate input, type the end of file indicator ",
                "when tou are prompted to enter input.",
                "On UNIX/Lnux/Mac OS X type <ctrl> d then press Enter",
                "On Windows type <ctrl> z then press Enter" );

        System.out.printf("%s\n %s", "Enter account number (> 0), first name, last name and balance.", "?");

        while (input.hasNext()) {
            try {
                // retrieve data to be output
                record.setAccount(input.nextInt());
                record.setFirstName(input.next());
                record.setLastName(input.next());
                record.setBalance(input.nextDouble());

                if (record.getAccount() > 0) {
                    output.format("%d %s %s %.2f\n", record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance())
                } else {
                    System.out.println(" Account number must be greater than 0");
                }
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file");
                return;
            } catch (NoSuchElementException elementException) {
                System.out.println(elementException.toString());
                System.err.println("Invalid input. Please try again");
                input.nextLine();
            }

            System.out.printf("%s %s\n %s", "Enter account number (>0),", "first name, last name and balane.", "?");

        }
    }

    // close file
    public void closeFile(){
        if (output != null){
            output.close();
        }
    }
}
