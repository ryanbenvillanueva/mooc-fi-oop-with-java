package phonesearch;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ryan Ben
 */
public class UserInterface {

    private Scanner reader;
    private ContactInformation contactInfo;

    public UserInterface() {
        this.reader = new Scanner(System.in);
        this.contactInfo = new ContactInformation();
    }

    public void start() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");

        while (true) {
            System.out.print("\ncommand: ");

            String command = reader.nextLine();

            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                addNumber();
            } else if (command.equals("2")) {
                searchForNumber();
            } else if (command.equals("3")) {
                searchPersonByNumber();
            } else if (command.equals("4")) {
                addAddress();
            } else if (command.equals("5")) {
                searchPersonalInfo();
            } else if (command.equals("6")) {
                deletePersonalInfo();
            } else if (command.equals("7")) {
                filteredListing();
            }
        }
    }

    private void addNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();

        contactInfo.addNumber(name, number);
    }

    private void searchForNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();

        contactInfo.searchForNumber(name);
    }

    private void searchPersonByNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();

        contactInfo.searchPersonByNumber(number);
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();

        contactInfo.addAddress(name, street, city);
    }

    private void searchPersonalInfo() {
        System.out.print("whose information: ");
        String name = reader.nextLine();

        contactInfo.searchPersonalInfo(name);
    }

    private void deletePersonalInfo() {
        System.out.print("whose information: ");
        String name = reader.nextLine();

        contactInfo.deletePersonalInfo(name);
    }

    private void filteredListing() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();

        contactInfo.filteredListing(keyword);
    }
}
