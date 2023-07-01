package com.brideglabz.adressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayContacts {

    public class AddressBook {
        private List<Contact> contacts;

        public AddressBook() {
            contacts = new ArrayList<>();
        }

        public void addContact(Contact contact) {
            contacts.add(contact);
        }

        public List<Contact> getContacts() {
            return contacts;
        }

        public void editContact(String firstName, String lastName) {
            for (Contact contact : contacts) {
                if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Enter New First Name: ");
                    String newFirstName = scanner.nextLine();
                    contact.setFirstName(newFirstName);

                    System.out.print("Enter New Last Name: ");
                    String newLastName = scanner.nextLine();
                    contact.setLastName(newLastName);

                    System.out.print("Enter New Address: ");
                    String newAddress = scanner.nextLine();
                    contact.setAddress(newAddress);

                    System.out.print("Enter New City: ");
                    String newCity = scanner.nextLine();
                    contact.setCity(newCity);

                    System.out.print("Enter New State: ");
                    String newState = scanner.nextLine();
                    contact.setState(newState);

                    System.out.print("Enter New Zip: ");
                    String newZip = scanner.nextLine();
                    contact.setZip(newZip);

                    System.out.print("Enter New Phone Number: ");
                    String newPhoneNumber = scanner.nextLine();
                    contact.setPhoneNumber(newPhoneNumber);

                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();
                    contact.setEmail(newEmail);

                    System.out.println("Contact details updated successfully!");
                    return;
                }
            }
            System.out.println("Contact not found!");
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
                System.out.println("2. Edit Contact");
                System.out.println("3. Display Contacts");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        break;

                    case 2:
                        System.out.print("Enter First Name of the contact to edit: ");
                        String editFirstName = scanner.nextLine();

                        System.out.print("Enter Last Name of the contact to edit: ");
                        String editLastName = scanner.nextLine();

                        addressBook.editContact(editFirstName, editLastName);
                        break;

                    case 3:
                        break;

                    case 4:
                        System.out.println("Exiting Address Book");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }
        }
    }

}
