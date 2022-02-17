package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Create a program that implements a simple mobile phone with the following capabilities

        1. Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following
           attributes :
            - Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
            - A constructor that takes a String(the phone number) and initialises myNumber and instantiates
              myContacts.
            - And seven methods, they are (their functions are n ther names):
                - addNewContact(), has one parameter of type Contact and returns a boolean. Returns
                  true if the contact does not exists, or false if the contact already exists.
                - updateContact(), has two parameters of type Contact (the old contact that will be updated
                  with the new contact) and returns a boolean. Returns true if the contact exists and was
                  updated successfully, or false if the contact does not exists.
                - removeContact(), has one parameter of type Contact and returns a boolean. Returns true
                  if the contact exists and was removed successfully, or false if the contact does not exists.
                - findContact(), has one parameter of type Contact() and returns an int. The returned value
                  is it's position in the ArrayList, it will either be -1(does not exists) or a value greater
                  than or equal to 0 (does exists)
                - findContact(), same as above, only it has one parameter of type String.
                - queryContact(), has one parameter of type String and returns a Contact. Use the
                  String to search for the same name and then return the Contact. Return null otherwise.
                - printContacts(), has one parameters and does not return anything. Print the contacts in the
                  following format:
                  Contact List:
                  1. Bob -> 342312344
                  2. Alice -> 42343343
                  3. Tom -> 423234234
                  4. Jane -> 234314124123

        2. Implement the Contact class with the following attributes:
           - Two fields, both String, one called name and the other phoneNumber.
           - A constructor that takes two String's, and initialises name and phoneNumber.
           - And Three methods, they are:
             - getName(), getter for name.
             - getPhoneNumber(), getter for phoneNumber.
             - createContact(), has two parameters of type String(the persons name and phone number) and returns an
               instance of Contact.This is the only method that is static.

        TIP: Two Contact objects are equal if they have the same name.
        TIP: In MobilePhone, use findContact() in the other methods.

        NOTE: All fields are private
        NOTE: Constructors should be defined as public.
        NOTE: All methods should be defined as public(except for the two findContact() methods which are private)

         */
    }
}
