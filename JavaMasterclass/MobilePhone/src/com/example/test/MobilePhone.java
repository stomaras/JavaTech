package com.example.test;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // 0. Print Instructions
    public void printInstructions(){
        System.out.println(" Choice 0: printInstructions \n" +
                "Choice 1: add new Contact \n" +
                "Choice 2: Update Contact \n" +
                "Choice 3: Remove Contact \n" +
                "Choice 4: Find Contact \n" +
                "Choice 5: Query Contact \n" +
                "Choice 6: Print Contacts");
    }

    // 1. Add new contact
    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }



    // 2. Update oldContact with a newContact
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position >= 0){
            myContacts.set(position, newContact);
            System.out.println("Contact exists and updated successfully!");
            return true;
        } else {
            System.out.println("Contact does not exists!");
            return false;
        }
    }

    // 3. Remove contact
    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0){
            System.out.println("Contact does not exists");
            return false;
        } else {
            myContacts.remove(position);
            return true;
        }
    }

    // 4. Find Contact
    //////////////////////////////////////////////
    //////////////////////////////////////////////
    private int findContact(Contact contact) {
        int position = myContacts.indexOf(contact);
        if (position >= 0) {
            return position;
        } else {
            return -1;
        }
    }

    private int findContact(String contactName) {
        for (int i = 0; i< this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    /////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////

    // 5. Query Contact
    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    // 6. Print Contacts
    public void printContacts(){
        System.out.println("Contact List: \n");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(+ i + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }








}
