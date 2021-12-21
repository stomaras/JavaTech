package com.example.test;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists");
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int removePosition = findContact(contact.getName());
        if (removePosition >= 0){
            this.myContacts.remove(removePosition);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact newContact, Contact oldContact) {
        int foundPosition = findContact(oldContact.getName());
        if (foundPosition >= 0){
            this.myContacts.set(foundPosition,newContact);
            return true;
        }
        return false;
    }

    public Contact queryContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i=0; i < myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public void printContacts(){
        System.out.println("Contacts: \n");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.println(+ i + ". Contact : " + this.myContacts.get(i).getName() + " -> " +" with phone : " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
