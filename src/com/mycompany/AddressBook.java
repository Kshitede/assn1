package com.mycompany;

import java.io.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contacts; // An array of Contacts - each stores info for one friend
    private String name; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook(String name) {
        this.name = name;
        contacts = new ArrayList<>();
    }

    // Add a contact that's passed in as a parameter.
    public void addContact(Contact c) {
        contacts.add(c);
    }

    // PrString out info on all contacts using method Contact class.
    public void printContacts() {
        contacts.stream().forEach(x -> System.out.println(x));
    }

    // Returns the number of friends currently in AddressBook
    public int numContacts() {
        return contacts.size();
    }

    // Returns a non-neg integer if a Contact with name s exists corresponding
    // to which place in the array friends the Contact is stored. Returns -1
    // otherwise.
    private boolean haveContact(String s) {
        if (contacts.contains(s))
            return contacts.contains(s);
        return false;
    }

    // Deletes a contact with name s, if one is in the AddressBook.
    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }


    public static void main(String[] args) throws IOException {
        Scanner stdin = new Scanner(System.in);
        // Instantiate AddressBook object
        System.out.println("Enter address book's name:");
        String addrName = stdin.next();
        AddressBook blackbook = new AddressBook(addrName);
        // Menu driven loop.
        menu();
        int choice = stdin.nextInt();
        while (choice != 5) {
            // Only adds contact if there is room in AddressBook blackbook.
            if (choice == 1) {
                if (blackbook.numContacts() < 10) {
                    //Reads in all appropriate information.");
                    System.out.println("Enter your friend\'s name:");
                    String name = stdin.next();
                    System.out.println("Enter their age.");
                    String age = stdin.next();
                    System.out.println("Enter their phone number.");
                    String number = stdin.next();
                    // Uses information to create Contact object, which is
                    // a parameter to the addContact method.
                    blackbook.addContact(new Contact(name, age, number));
                } else
                    System.out.println("Sorry, can not add anyone, your blackbook is full.");
            }
            // Implements rest of the choices by calling appropriate AddressBook methods on blackbook.
            else if (choice == 2) {
                System.out.println("What is the name of the contact you want to delete?");
                String name = stdin.next();
                Contact contact = blackbook.contacts.stream().filter(x-> x.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
                blackbook.deleteContact(contact);
            } else if (choice == 3) {
                menuEdit();
                String strName = stdin.next();
                Contact contact = blackbook.contacts.stream().filter(x-> x.getName().equalsIgnoreCase(strName)).findFirst().orElse(null);
                System.out.println("Enter new phone number");
                String phoneNo = stdin.next();
                contact.changeNumber(phoneNo);
            } else if (choice == 4) {
                blackbook.printContacts();
            } else if (choice != 5) {
                System.out.println("Sorry, that was an invalid menu choice, try again.");
            }
            menu();
            choice = stdin.nextInt();
        }
    }

    private static void menuEdit() {
        System.out.println("Please enter the name of the contact you want to edit");
        System.out.println("Enter your menu choice:");
    }

    public static void menu() {
        System.out.println("1.Add a new contact to your address book.");
        System.out.println("2.Delete a contact from your address book.");
        System.out.println("3.Edit a contact from your address book.");
        System.out.println("4.Print out information of all of your contacts.");
        System.out.println("5.Quit.");
        System.out.println("Enter your menu choice:");
    }
}