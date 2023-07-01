package com.brideglabz.adressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdsressBook {

        private List<Contact> contacts;

        public AddressBook() {
            contacts = new ArrayList<>();
        }

        public void addContact(Contact contact) {
            contacts.add(contact);
        }

        public void displayContacts() {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            AddressBook addressBook = new AddressBook();

            System.out.println("Welcome to Address Book Program");

            while (true) {
                System.out.println("\nSelect an option:");
                System.out.println("1. Add Contact");
                System.out.println("2. Display Contacts");
                System.out.println("3. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter First Name: ");
                        String firstName = scanner.nextLine();

                        System.out.print("Enter Last Name: ");
                        String lastName = scanner.nextLine();

                        System.out.print("Enter Address: ");
                        String address = scanner.nextLine();

                        System.out.print("Enter City: ");
                        String city = scanner.nextLine();

                        System.out.print("Enter State: ");
                        String state = scanner.nextLine();

                        System.out.print("Enter Zip: ");
                        String zip = scanner.nextLine();

                        System.out.print("Enter Phone Number: ");
                        String phoneNumber = scanner.nextLine();

                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();

                        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                        addressBook.addContact(contact);

                        System.out.println("Contact added successfully!");
                        break;

                    case 2:
                        System.out.println("Contacts in Address Book:");
                        addressBook.displayContacts();
                        break;

                    case 3:
                        System.out.println("Exiting Address Book");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }
        }
    }



