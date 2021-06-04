package com.example.test;

import java.sql.SQLOutput;
import java.util.Scanner;

//Create a program that implements a simple mobile phone with the following capabilities.
//
//1. Implement the master class MobilePhone, that holds the ArrayList of Contacts,
// with the following attributes
// Two fields, a String called myNumber and an ArrayList of Type Contact called
// myContacts.
// A constructor that takes a String(the phone number) and initialises myNumber and
// instantiates myContacts
// And seven methods, they are(their functions are in their names):
// - addNewContact(), has one parameter of type Contact and returns a boolean.
// Returns true if the contact does not exist, or false if the contact already exists.
// - updateContact(), has two parameters of type Contact(the old contact that will be
// updated with the new contact) and returns a boolean.
// - removeContact(), has one parameter of type Contact and returns a boolean. Returns
// true if the contact exists and was removed successfully, or false if the contact
// does not exists.
// - findContact(), has one parameter of type Contact and returns an int. The returned
// value it's position in the ArrayList, it will either be -1(does not exists) or a value
// greater than or equal to 0(does exists).
// - findContact(), same as above, only it has one parameter of type String.
// - queryContact(), has one parameter of type String and returns a Contact.Use the
// String to search for the name and then return the Contact. Return null otherwise.
// - printContacts(), has no parameters and does not return anything. Print the contacts
// in the following format:
// Contact List:
// 1. Bob -> 314684389
// 2. Alice -> 16180339
// 3. Tom -> 112345788
// Implement the Contact class with the following attributes:
// Two fields, both String, one called name and the other phoneNumber.
// A constructor that takes two String's and initialises name and phone number.
// And Three methods, they are:
// getName(), getter for name.
// getPhoneNumber(), getter for phoneNumber
// createContact(), has two parameters of type String (the persons name and phone number)
// and returns an instance of Contact. This is the only method that is static.
public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
	// write your code here

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {

            System.out.println("\nEnter action: 6 to show available actions");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }


        }




    }


    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = sc.nextLine();
        System.out.println("Enter phone number");
        String phone = sc.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " + name + ", phone = " +phone);
        }else {
            System.out.println("Cannot add, " + name + " already on file ");
        }
    }

    private static void updateContact(){
        System.out.println("Enter  contact name: ");
        String name = sc.nextLine();
        System.out.println("Enter  contact phone: ");
        String phone = sc.nextLine();
        Contact newContact = new Contact(name, phone);
        Contact existingContact = mobilePhone.queryContact(name);
        if( existingContact!= null){
            System.out.println("Enter new contact name: ");
            String newName = sc.nextLine();
            System.out.println("Enter new contact phone number: ");
            String newNumber = sc.nextLine();
            Contact contact = Contact.createContact(newName, newNumber);
            mobilePhone.updateContact(existingContact, contact);
        } else {
            System.out.println("Contact not found");
            return;
        }
    }

    private static void removeContact(){
        System.out.println("Enter contact name: ");
        String name = sc.nextLine();
        System.out.println("Enter contact phone: ");
        String phone = sc.nextLine();
        Contact contact = new Contact(name, phone);
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact != null){
            mobilePhone.removeContact(existingContact);
            System.out.println("Contact removed successfully!");
        } else {
            System.out.println("Contact not found");
            return;
        }
    }

    private static void queryContact(){
        System.out.println("Enter contact name: " );
        String name = sc.nextLine();
        Contact searchingContact = mobilePhone.queryContact(name);
        if (searchingContact != null){
           String namee = searchingContact.getName();
            System.out.println("Contact with name : " + namee + " removed successfully!");
           mobilePhone.removeContact(searchingContact);
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions."
                );
        System.out.println("Choose your action: ");
    }
}
