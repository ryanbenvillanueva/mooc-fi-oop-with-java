/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesearch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Ryan Ben
 */
public class ContactInformation {

    private Map<String, Set<String>> nameAndNumbers;
    private Map<String, String> numberAndName;
    private Map<String, Address> nameAndAddresses;

    public ContactInformation() {
        this.nameAndNumbers = new HashMap<String, Set<String>>();
        this.numberAndName = new HashMap<String, String>();
        this.nameAndAddresses = new HashMap<String, Address>();
    }

    public void addNumber(String name, String number) {
        if (!nameAndNumbers.containsKey(name)) {
            nameAndNumbers.put(name, new HashSet<String>());
        }

        if (!numberAndName.containsKey(number)) {
            numberAndName.put(number, name);
        }

        nameAndNumbers.get(name).add(number);
    }

    public void searchForNumber(String name) {
        if (nameAndNumbers.containsKey(name)) {
            for (String number : nameAndNumbers.get(name)) {
                System.out.println(" " + number);
            }
        } else {
            System.out.println("  not found");
        }
    }

    public void searchPersonByNumber(String number) {
        if (numberAndName.containsKey(number)) {
            System.out.println(" " + numberAndName.get(number));
        } else {
            System.out.println(" not found");
        }
    }

    public void addAddress(String name, String street, String city) {
        nameAndAddresses.put(name, new Address(street, city));
    }

    public void searchPersonalInfo(String name) {
        if (!nameAndAddresses.containsKey(name) && !nameAndNumbers.containsKey(name)) {
            System.out.println("  not found");
        } else {
            if (nameAndAddresses.containsKey(name)) {
                System.out.println("  address: " + nameAndAddresses.get(name));
            } else {
                System.out.println("  address unknown");
            }

            if (nameAndNumbers.containsKey(name)) {
                System.out.println("  phone numbers:");
                for (String number : nameAndNumbers.get(name)) {
                    System.out.println("   " + number);
                }
            } else {
                System.out.println("  phone number not found");
            }
        }
    }

    public void deletePersonalInfo(String name) {
        if (nameAndNumbers.containsKey(name)) {
            for (String number : nameAndNumbers.get(name)) {
                nameAndNumbers.remove(number);
            }

            nameAndNumbers.remove(name);
        }
        
        if (numberAndName.containsValue(name)) {
            numberAndName.clear();
        }

        if (nameAndAddresses.containsKey(name)) {
            nameAndAddresses.remove(name);
        }
    }

    public void filteredListing(String keyword) {
        TreeMap<String, Set<String>> sortedNameAndNumbers = new TreeMap<String, Set<String>>(nameAndNumbers);

        boolean found = false;

        for (String name : sortedNameAndNumbers.keySet()) {
            if (name.contains(keyword) || (nameAndAddresses.containsKey(name) && nameAndAddresses.get(name).isKeywordInAddress(keyword))) {
                found = true;
                System.out.println("\n " + name);
                searchPersonalInfo(name);
            }
        }

        if (!found) {
            System.out.println(" keyword not found");
        }
    }
}
