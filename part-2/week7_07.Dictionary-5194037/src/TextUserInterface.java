/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement:");
        System.out.println("  quit - quit the text user interface");

        while (true) {
            System.out.print("Statement: ");
            String command = reader.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equalsIgnoreCase("add")) {
                this.add();
            } else if (command.equalsIgnoreCase("translate")) {
                this.translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
    
    public void add() {
        System.out.print("In Finnish:");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        
        dictionary.add(word, translation);
    }
        
    public void translate() {
        System.out.print("Give a word:");
        String word = reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(word));
    }
}
