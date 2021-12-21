package com.example.test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("6980863730");

    public static void main(String[] args) {
	// write your code here
        startPhone();
        boolean quit = false;
        int choice ;
        System.out.println("Enter your options: \n");
        while (!quit) {

            System.out.println("\n");
            printInstructions();
            System.out.println("\n");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    shutDown();
                    quit = true;
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    printContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    updateContact();
                    break;

            }

        }
    }

    private static void startPhone() {
        System.out.println("Phone started ... ");
    }

    private static void shutDown() {
        System.out.println("Phone shutting down ... ");
    }

    private static void printInstructions() {
        System.out.println(
                "Enter 0 to print instructions \n" +
                "Enter 1 to shutting down \n" +
                "Enter 2 to add a new contact \n" +
                "Enter 3 to print contacts \n" +
                "Enter 4 to remove a contact \n" +
                "Enter 5 to update a contact"
        );
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone: ");
        String newPhone = scanner.nextLine();
        Contact contact = Contact.createContact(newName,newPhone);
        if (mobilePhone.addNewContact(contact) == true){
            System.out.println("New contact added with name: " + newName + " and with phone: " + newPhone );
        } else {
            System.out.println("Contact with name: " + newName + " already exists");
        }
    }

    private static void printContacts(){
        mobilePhone.printContacts();
    }

    private static void removeContacts(){
        System.out.println("Enter contact name to remove: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact phone to remove: ");
        String phone = scanner.nextLine();
        Contact contact = Contact.createContact(name,phone);
        if (mobilePhone.removeContact(contact) == true) {
            System.out.println("Contact with name: " + name + " and with phone: " + phone + " has been removed! ");
        } else {
            System.out.println("Contact with name: " + name + " not founded in mobilePhone.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter an existing contact name: ");
        String name = scanner.nextLine();
        if (mobilePhone.queryContact(name) == null) {
            System.out.println("Contact with name: " + name + " does not exist!");
        } else {
            Contact oldContact = mobilePhone.queryContact(name);
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new contact phone: ");
            String newPhone = scanner.nextLine();
            Contact newContact = Contact.createContact(newName,newPhone);
            mobilePhone.updateContact(newContact,oldContact);
            System.out.println("New contact with name: " + newContact.getName() + " and phone: " + newContact.getPhoneNumber() + " update contact phone list!");
        }
    }


}
