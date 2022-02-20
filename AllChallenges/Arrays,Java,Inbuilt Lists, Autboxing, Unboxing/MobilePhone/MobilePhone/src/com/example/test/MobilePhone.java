package com.example.test;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        for (Contact contact1 : myContacts){
            if (contact1.equals(contact)){
                return false;
            }
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int index = this.myContacts.indexOf(oldContact);
        if (index == -1){
            return false;
        }
        this.myContacts.set(index, newContact);
        return true;
    }

    public boolean removeContact(Contact removeContact) {
        int index = this.myContacts.indexOf(removeContact);
        if (index == -1) {
            return false;
        }
        this.myContacts.remove(index);
        return true;
    }

    private int findContact(Contact searchContact) {
        for (int i = 0; i < this.myContacts.size(); i++){
            Contact currentContact = this.myContacts.get(i);
            if (currentContact.equals(searchContact)){
                return i;
            }
        }
        return -1;
    }

    public void printContacts(){
        System.out.println("Contact List: \n");
        for (int i = 1; i < this.myContacts.size(); i++){
            System.out.println(i + "." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

}
