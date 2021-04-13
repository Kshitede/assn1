package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String strChoice="";
        ArrayList<ContactPerson> phonebook = new ArrayList<>();
        do {
            System.out.println("Enter whether you want to add(A), Edit(E), Delete(D) or Exit(X)");
            strChoice = sc.next();
            if("A".equalsIgnoreCase(strChoice)) {
            String strAddMore = "N";

                System.out.println("First Name: ");
                String strFirstName = sc.next();
                System.out.println("Last Name: ");
                String strLastName = sc.next();
                System.out.println("Address: ");
                String strAddress = sc.next();
                System.out.println("City: ");
                String strCity = sc.next();
                System.out.println("State: ");
                String strState = sc.next();
                System.out.println("Zip: ");
                String strZip = sc.next();
                System.out.println("Phone Number: ");
                String strPhone = sc.next();
                System.out.println("Email: ");
                String strEmail = sc.next();
                System.out.println("Do you want to add more employees? Y/N ");
                strAddMore = sc.next();
                phonebook.add(new ContactPerson(strFirstName, strLastName, strAddress, strCity, strState, strZip, strPhone, strEmail));
            }
            if("E".equalsIgnoreCase(strChoice)){

            }
            if("D".equalsIgnoreCase(strChoice)){

            }
        }while (!"X".equalsIgnoreCase(strChoice));


        System.out.println("Following contacts added:");
        phonebook.stream().forEach(x -> System.out.println(x));
    }
}