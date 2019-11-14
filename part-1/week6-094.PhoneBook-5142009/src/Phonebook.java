/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<Person>();
    }
    public void add(String name, String number) {
        Person person = new Person(name, number);
        contacts.add(person);
    }
    
    public void printAll() {
        for (Person contact : contacts) {
            System.out.println(contact);
        }
    }
    
    public String searchNumber(String name) {
        String phoneNumber = "";
        for (Person contact : contacts) {
            if (contact.getName().equals(name)) {
                phoneNumber = contact.getNumber();
                break;
            } else {
                phoneNumber ="number not known";
            }
        }
        return phoneNumber;
    }
}
