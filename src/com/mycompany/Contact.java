package com.mycompany;

public class Contact {
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }

    private String name; // Stores name of Contact
    private String age;  // Stores age of Contact
    private String phonenumber; // Stores phone number of contact

    // Creates Contact object based on parameters.
    public Contact(String n, String a, String p) {
        name = n;
        age = a;
        phonenumber = p;
    }

    // Changes phone number of contact
    public void changeNumber(String newnum) {
        phonenumber = newnum;
    }

    // Returns the name of a Contact
    public String getName() {
        return name;
    }

    // Returns the age of a Contact
    public String getAge() {
        return age;
    }

    // Returns the phone number of a Contact
    public String getNumber() {
        return phonenumber;
    }

    // Prints all information about a contact out.
    public void printContact() {
        System.out.print("Name: " + name + " Age: " + age + " Phone#: " + phonenumber);
    }
}