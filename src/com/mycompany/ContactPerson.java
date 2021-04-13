package com.mycompany;

import java.util.Comparator;

public class ContactPerson implements Comparator<ContactPerson> {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public ContactPerson(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
 }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return firstName + " " + lastName + " : " + phoneNumber;
    }

    public int compare(ContactPerson contact1, ContactPerson contact2) {
        return (contact1.getFirstName()+contact1.getLastName()).compareToIgnoreCase(contact2.getFirstName()+contact2.getLastName());
    }


}
