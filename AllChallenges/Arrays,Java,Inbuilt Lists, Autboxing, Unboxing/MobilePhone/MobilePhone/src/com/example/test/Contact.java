package com.example.test;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Contact)){
            return false;
        }

        Contact contact = (Contact) obj;

        if (contact.getName().equals(this.getName()) && (contact.getPhoneNumber().equals(this.getPhoneNumber()))){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Contact with phone number: " + phoneNumber + ", with name: " + name;
    }
}
